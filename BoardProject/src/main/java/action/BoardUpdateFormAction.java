package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardUpdateFormService;
import vo.ActionForward;
import vo.BoardVO;

public class BoardUpdateFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		int num = Integer.parseInt(request.getParameter("num"));
		String pageNum = request.getParameter("pageNum");
		
		BoardUpdateFormService boardUpdateFormService = new BoardUpdateFormService();
		
		BoardVO article = boardUpdateFormService.getArticle(num);
		request.setAttribute("article", article);
		request.setAttribute("pageNum", pageNum);
		
		forward.setUrl("board/updateForm.jsp");
		
		return forward;
	}

}
