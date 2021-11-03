package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.ReplyVO;

public class BoardWriteFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		// ���� �ۼ��ϴ� ȭ�鿡���� ��ʱ��� �ۼ��� �� �� �ְ�, �亯���� �ۼ��� �� ���ִ�.
		// �ۼ��ϴ� ���� �亯 ���϶��� �亯�ۿ� �ʿ��� ������ �Ķ���� ������ �Ѿ��.
		
		int num = 0, ref = 1, re_step = 0, re_level = 0;
		if(request.getParameter("num") != null) {
			// �亯���̸�
			num = Integer.parseInt(request.getParameter("num"));
			ref = Integer.parseInt(request.getParameter("ref"));
			re_step = Integer.parseInt(request.getParameter("re_step"));
			re_level = Integer.parseInt(request.getParameter("re_level"));
		}
		
		// ������
		// �ۼ��� ���� �亯������ ������ �����ϰ� ������
		ReplyVO replyVO = new ReplyVO();
		replyVO.setNum(num);
		replyVO.setRe_level(re_level);
		replyVO.setRe_step(re_step);
		replyVO.setRef(ref);
		
		request.setAttribute("replyVO", replyVO);
		
		ActionForward forward = new ActionForward();
		forward.setUrl("board/writeForm.jsp");
		
		return forward;
	}

}
