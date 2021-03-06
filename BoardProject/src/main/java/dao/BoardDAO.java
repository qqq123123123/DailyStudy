package dao;

import static db.JdbcUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vo.BoardVO;

//DAO(Data Access Object) : DBMS로 SQL 구문을 전송하는 클래스
public class BoardDAO {
   private Connection con;
   //singleton 패턴
   
   private static BoardDAO instance;
   
   private BoardDAO() {}
   
   public static BoardDAO getInstance() {
      if(instance == null) {
         instance = new BoardDAO();
      }
      return instance;
   }
   
   public void setConnection(Connection con) {
      this.con = con;
   }

   public int insertArticle(BoardVO boardVO) throws Exception {
      // TODO Auto-generated method stub
      int insertCount = 0;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      //답변글 처리에 필요한 값들
      int num = boardVO.getNum();
      int ref = boardVO.getRef();
      int re_step = boardVO.getRe_step();
      int re_level = boardVO.getRe_level();
      
      int number = 0;
      //작성한 글이 원글일때 새로 부여할 관련글 번호를 저장할 변수
      String sql = "";
      
      try {
         pstmt = con.prepareStatement("SELECT MAX(num) FROM board");
         rs = pstmt.executeQuery();
         //현재 작성된 글이 없으면 최대값은 레코드가 없다.
         
         if(rs.next()) { //지금까지 작성된 글이 하나라도 있으면...
            number = rs.getInt(1) + 1;
         } else {
            number = 1;
         }
         
         if(num != 0) {
            //작성한 글이 답글이면...
            sql = "UPDATE board SET re_step = re_step + 1 WHERE ref = ? AND re_step > ?";
            //답변을 달려는 대상글의 ref 값과 같은 ref 값을 가지고 있고, 답변을 달려는 대상들의 
            //re_step 값보다 큰 re_step 값을 가지고 있는 글들의 re_step 값을 1씩 증가시켜라
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, ref);
            pstmt.setInt(2, re_step);
            pstmt.executeUpdate();
            
            re_step = re_step + 1;
            re_level = re_level + 1;
         }
         else {
            ref = number;
            re_step = 0;
            re_level = 0;
         }
         
         sql = "INSERT INTO board(num, writer, email, subject, passwd, reg_date, ref, re_step, re_level, content)" +
               " VALUES(board_seq.nextval,?,?,?,?,?,?,?,?,?)";
         
         pstmt = con.prepareStatement(sql);
         pstmt.setString(1, boardVO.getWriter());
         pstmt.setString(2, boardVO.getEmail());
         pstmt.setString(3, boardVO.getSubject());
         pstmt.setString(4, boardVO.getPasswd());
         pstmt.setTimestamp(5, boardVO.getReg_date());
         pstmt.setInt(6, ref);
         pstmt.setInt(7, re_step);
         pstmt.setInt(8, re_level);
         pstmt.setString(9, boardVO.getContent());
         
         insertCount = pstmt.executeUpdate();
         
      } 
      catch (Exception e) {
         e.printStackTrace();
      }
      finally {
         close(rs);
         close(pstmt);
      }
      
      return insertCount;
   }

   public int selectArticleCount() throws Exception {
	// TODO Auto-generated method stub
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int articleCount = 0;
	try {
		pstmt = con.prepareStatement("SELECT COUNT(*) FROM board");
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			articleCount = rs.getInt(1);
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return articleCount;
   }

public List<BoardVO> selectArticleList(int startRow, int pageSize) throws Exception{
	// TODO Auto-generated method stub
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	List<BoardVO> articleList = null;
	try {
		// 해당 페이지에 출력될 글들만 조회해야 함
		pstmt = con.prepareStatement(""
				+ "SELECT list2.* FROM (SELECT ROWNUM r, list1.* "
				+ " FROM (SELECT * FROM board ORDER BY ref DESC, re_step ASC) list1)"
				+ " list2 WHERE r BETWEEN ? AND ?");
		pstmt.setInt(1, startRow);
		pstmt.setInt(2, startRow + pageSize -1);
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			articleList = new ArrayList<BoardVO>();
			do {
				BoardVO boardVO = new BoardVO();
				boardVO.setContent(rs.getString("content"));
				boardVO.setNum(rs.getInt("num"));
				boardVO.setWriter(rs.getString("writer"));
				boardVO.setEmail(rs.getString("email"));
				boardVO.setSubject(rs.getString("subject"));
				boardVO.setPasswd(rs.getString("passwd"));
				boardVO.setReg_date(rs.getTimestamp("reg_date"));
				boardVO.setReadcount(rs.getInt("readcount"));
				boardVO.setRef(rs.getInt("ref"));
				boardVO.setRe_step(rs.getInt("re_step"));
				boardVO.setRe_level(rs.getInt("re_level"));
				boardVO.setContent(rs.getString("content"));
				articleList.add(boardVO);
			} while (rs.next());
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
        close(rs);
        close(pstmt);
     }

	return articleList;
}

public BoardVO selectArticleCount(int num) {
	// TODO Auto-generated method stub
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	BoardVO article = null;
	try {
		// 조회수 증가 작업
		pstmt = con.prepareStatement(""
				+ "UPDATE board SET readcount = readcount + 1 WHERE num = ?");
		pstmt.setInt(1, num);
		int updateCount = pstmt.executeUpdate();
		if(updateCount > 0) {
			commit(con);
		}
		else {
			rollback(con);
		}
		
		pstmt = con.prepareStatement(""
				+ "SELECT * FROM board WHERE num = ?");
		pstmt.setInt(1, num);
		rs = pstmt.executeQuery();
		if(rs.next()) {
				article = new BoardVO();
				article.setContent(rs.getString("content"));
				article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
				article.setEmail(rs.getString("email"));
				article.setSubject(rs.getString("subject"));
				article.setPasswd(rs.getString("passwd"));
				article.setReg_date(rs.getTimestamp("reg_date"));
				article.setReadcount(rs.getInt("readcount"));
				article.setRef(rs.getInt("ref"));
				article.setRe_step(rs.getInt("re_step"));
				article.setRe_level(rs.getInt("re_level"));
				article.setContent(rs.getString("content"));
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
        close(rs);
        close(pstmt);
     }
	return article;
}

public BoardVO selectUpdateArticle(int num) throws Exception {
	// TODO Auto-generated method stub
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	BoardVO article = null;
	try {
		
		pstmt = con.prepareStatement(""
				+ "SELECT * FROM board WHERE num = ?");
		pstmt.setInt(1, num);
		rs = pstmt.executeQuery();
		if(rs.next()) {
				article = new BoardVO();
				article.setContent(rs.getString("content"));
				article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
				article.setEmail(rs.getString("email"));
				article.setSubject(rs.getString("subject"));
				article.setPasswd(rs.getString("passwd"));
				article.setReg_date(rs.getTimestamp("reg_date"));
				article.setReadcount(rs.getInt("readcount"));
				article.setRef(rs.getInt("ref"));
				article.setRe_step(rs.getInt("re_step"));
				article.setRe_level(rs.getInt("re_level"));
				article.setContent(rs.getString("content"));
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
        close(rs);
        close(pstmt);
     }
	return article;
}

public int updateArticle(BoardVO boardVO) {
	// TODO Auto-generated method stub
	//먼저 사용자가 입력한 비밀번호가 글을 등록했을때 입력한 번호와 같으면 
	//수정작업을 실행
	//비밀번호가 틀리면 작성한 글이 아니라고 판단하고 실패 처리
	 int updateCount = 0;
     PreparedStatement pstmt = null;
     ResultSet rs = null;
     String sql = "";
     String dbPasswd = null;
     //데이터 베이스에서 가져온 비밀번호
     
     try {
        pstmt = con.prepareStatement("SELECT passwd FROM board WHERE num = ?");
        pstmt.setInt(1, boardVO.getNum());
        rs = pstmt.executeQuery();
        //현재 수정작업 대상이 되는 글의 비밀번호를 가져옴
    
        if(rs.next()) {
           //해당 글번호를 가지고 있는 글이 있으면
           dbPasswd = rs.getString("passwd");
           if(dbPasswd.equals(boardVO.getPasswd())) {
        	   sql = "UPDATE board SET writer = ?, email = ?, subject = ?, content = ?"
        	   		+ "WHERE num = ?";
           
           pstmt = con.prepareStatement(sql);
           pstmt.setString(1, boardVO.getWriter());
           pstmt.setString(2, boardVO.getEmail());
           pstmt.setString(3, boardVO.getSubject());
           pstmt.setString(4, boardVO.getContent());
           pstmt.setInt(5, boardVO.getNum());
           updateCount = pstmt.executeUpdate();
           }
        }
     }
     catch (Exception e) {
        e.printStackTrace();
     }
     finally {
        close(rs);
        close(pstmt);
     }
     
     return updateCount;
}

public int deleteArticle(BoardVO boardVO) {
	int deleteCount = 0;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "";
    String dbPasswd = null;	// db에 있는 패스워드
    try {
    	pstmt = con.prepareStatement("SELECT passwd FROM BOARD WHERE num = ?");
        pstmt.setInt(1, boardVO.getNum());
        rs = pstmt.executeQuery();
        
        if(rs.next())
        {
        	dbPasswd = rs.getString("passwd");
        	if(dbPasswd.equals(boardVO.getPasswd()))
        	{
        		sql = "DELETE FROM BOARD WHERE num =" + boardVO.getNum();
        		
                deleteCount = pstmt.executeUpdate(sql);
        	}
        }
		
	} catch (Exception e) {
		e.printStackTrace();
	}
    finally
    {
    	close(rs);
    	close(pstmt);
    }
    
    
    
	return deleteCount;
}


}

