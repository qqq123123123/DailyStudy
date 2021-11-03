package service;

import static db.JdbcUtil.commit;
import static db.JdbcUtil.getConnection;
import static db.JdbcUtil.rollback;

import java.sql.Connection;

import dao.BoardDAO;
import vo.BoardVO;

public class BoardDeleteProService {

	public boolean deleteVO(BoardVO boardVO) {

		boolean deleteSuccess = false;
	    Connection con = getConnection();
	    BoardDAO boardDAO = BoardDAO.getInstance();
	    boardDAO.setConnection(con);
	    
	    int deleteCount = boardDAO.deleteArticle(boardVO);
	    if(deleteCount > 0) {
	    	commit(con);
	    	deleteSuccess = true;
	    }
	    else {
	    	rollback(con);
	    }
	    System.out.println(deleteSuccess);
		return deleteSuccess;
	}

	public boolean deleteVO(int num, String passwd) {
		boolean deleteSuccess = false;
	    Connection con = getConnection();
	    BoardDAO boardDAO = BoardDAO.getInstance();
	    boardDAO.setConnection(con);
	    
	    int deleteCount = boardDAO.deleteArticle(num, passwd);
	    if(deleteCount > 0) {
	    	commit(con);
	    	deleteSuccess = true;
	    }
	    else {
	    	rollback(con);
	    }
	    System.out.println(deleteSuccess);
	    
	    
		return deleteSuccess;
	}

}
