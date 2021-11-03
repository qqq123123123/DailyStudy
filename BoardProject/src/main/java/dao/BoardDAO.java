package dao;

import static db.JdbcUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vo.BoardVO;

//DAO(Data Access Object) : DBMS�� SQL ������ �����ϴ� Ŭ����
public class BoardDAO {
   private Connection con;
   //singleton ����
   
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
      
      //�亯�� ó���� �ʿ��� ����
      int num = boardVO.getNum();
      int ref = boardVO.getRef();
      int re_step = boardVO.getRe_step();
      int re_level = boardVO.getRe_level();
      
      int number = 0;
      //�ۼ��� ���� �����϶� ���� �ο��� ���ñ� ��ȣ�� ������ ����
      String sql = "";
      
      try {
         pstmt = con.prepareStatement("SELECT MAX(num) FROM board");
         rs = pstmt.executeQuery();
         //���� �ۼ��� ���� ������ �ִ밪�� ���ڵ尡 ����.
         
         if(rs.next()) { //���ݱ��� �ۼ��� ���� �ϳ��� ������...
            number = rs.getInt(1) + 1;
         } else {
            number = 1;
         }
         
         if(num != 0) {
            //�ۼ��� ���� ����̸�...
            sql = "UPDATE board SET re_step = re_step + 1 WHERE ref = ? AND re_step > ?";
            //�亯�� �޷��� ������ ref ���� ���� ref ���� ������ �ְ�, �亯�� �޷��� ������ 
            //re_step ������ ū re_step ���� ������ �ִ� �۵��� re_step ���� 1�� �������Ѷ�
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
		// �ش� �������� ��µ� �۵鸸 ��ȸ�ؾ� ��
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
		// ��ȸ�� ���� �۾�
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
	//���� ����ڰ� �Է��� ��й�ȣ�� ���� ��������� �Է��� ��ȣ�� ������ 
	//�����۾��� ����
	//��й�ȣ�� Ʋ���� �ۼ��� ���� �ƴ϶�� �Ǵ��ϰ� ���� ó��
	 int updateCount = 0;
     PreparedStatement pstmt = null;
     ResultSet rs = null;
     String sql = "";
     String dbPasswd = null;
     //������ ���̽����� ������ ��й�ȣ
     
     try {
        pstmt = con.prepareStatement("SELECT passwd FROM board WHERE num = ?");
        pstmt.setInt(1, boardVO.getNum());
        rs = pstmt.executeQuery();
        //���� �����۾� ����� �Ǵ� ���� ��й�ȣ�� ������
    
        if(rs.next()) {
           //�ش� �۹�ȣ�� ������ �ִ� ���� ������
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
    String dbPasswd = null;	// db�� �ִ� �н�����
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

public int deleteArticle(int num, String passwd) {
	
	int deleteCount = 0;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "";
    String dbPasswd = null;	// db�� �ִ� �н�����
    try {
    	pstmt = con.prepareStatement("SELECT passwd FROM BOARD WHERE num = ?");
        pstmt.setInt(1, num);
        rs = pstmt.executeQuery();
        
        if(rs.next())
        {
        	dbPasswd = rs.getString("passwd");
        	if(dbPasswd.equals(passwd))
        	{
        		sql = "DELETE FROM BOARD WHERE num =" + num;
        		
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

