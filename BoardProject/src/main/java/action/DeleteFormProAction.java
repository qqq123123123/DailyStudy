package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardDeleteProService;
import vo.ActionForward;
import vo.BoardVO;

public class DeleteFormProAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
//		BoardVO boardVO = new BoardVO();
		int num = Integer.parseInt(request.getParameter("num"));
		String passwd = (request.getParameter("passwd"));
		
		BoardDeleteProService boardDeleteProService = new BoardDeleteProService();
		
		boolean deleteSuccess = boardDeleteProService.deleteVO(num, passwd);
		
		if(deleteSuccess)
		{
			forward = new ActionForward();
			forward.setUrl("boardList.bo");
			forward.setRedirect(true);
		}
		else
		{
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('��������')");
			out.println("history.back();");
			out.println("<script>");
		}
		
		return forward;
	}

}
