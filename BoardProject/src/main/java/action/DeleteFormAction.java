package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardUpdateFormService;
import vo.ActionForward;
import vo.BoardVO;

public class DeleteFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		int num = Integer.parseInt(request.getParameter("num"));
		String pageNum = request.getParameter("pageNum");
		
		
		request.setAttribute("num", num);
		request.setAttribute("pageNum", pageNum);
		
		forward.setUrl("board/deleteForm.jsp");
		
		
		return forward;
	}

}
