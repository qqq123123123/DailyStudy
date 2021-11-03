package service;
import static db.JdbcUtil.*;

import java.sql.Connection;

import dao.BoardDAO;
import vo.BoardVO;
public class BoardUpdateProService {

	public boolean modifyArticle(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boolean modifySuccess = false;
	    Connection con = getConnection();
	    BoardDAO boardDAO = BoardDAO.getInstance();
	    boardDAO.setConnection(con);
	      
	    int updateCount = boardDAO.updateArticle(boardVO);
	    if(updateCount > 0) {
	    	commit(con);
	    	modifySuccess = true;
	    	System.out.println(updateCount);
	    }
	    else {
	    	rollback(con);
	    }
		return modifySuccess;
	}

}
