package action;

import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardWriteProService;
import vo.ActionForward;
import vo.BoardVO;

public class BoardWriteProAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		// ����ڰ� �ۼ��� �����͵�(�Ķ���Ͱ���)�� �� �޾Ƽ� VO(DTO)��ü�� �Ҵ��ϰ� ����Ŭ������ ����
		BoardVO boardVO = new BoardVO();
		boardVO.setContent(request.getParameter("content"));
		boardVO.setEmail(request.getParameter("email"));
		boardVO.setNum(Integer.parseInt(request.getParameter("num")));
		boardVO.setPasswd(request.getParameter("passwd"));
		boardVO.setRe_level(Integer.parseInt(request.getParameter("re_level")));
		boardVO.setRef(Integer.parseInt(request.getParameter("ref")));
		boardVO.setRe_step(Integer.parseInt(request.getParameter("re_step")));
		boardVO.setReadcount(0);
		boardVO.setReg_date(new Timestamp(System.currentTimeMillis()));
		boardVO.setSubject(request.getParameter("subject"));
		boardVO.setWriter(request.getParameter("writer"));
		
		BoardWriteProService boardWriteProService = new BoardWriteProService();
		boolean registSuccess = boardWriteProService.registArticle(boardVO);
		
		ActionForward forward = null;
		if (registSuccess) {
			forward = new ActionForward();
			forward.setUrl("boardList.bo"); //���ۼ��� �۸�Ϻ��� ��û
			forward.setRedirect(true);
		}else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<scripte>");
			out.println("alert('��Ͻ���')");
			out.println("history.back");
			out.println("</scripte>");
			
		}
		
		return forward;
	}

}
