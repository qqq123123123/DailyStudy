package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.BoardContentAction;
import action.BoardListAction;
import action.BoardWriteFormAction;
import action.BoardWriteProAction;
import action.DeleteFormAction;
import action.DeleteFormProAction;
import action.UpdateFormAction;
import action.UpdateProAction;
import vo.ActionForward;

/**
 * Servlet implementation class boardFrontController
 */
@WebServlet("*.bo")
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. ��û�ľ�
		String requestURI = request.getRequestURI();
		//��û URL : http://localhost:8088/MemberProject/login.me
		//requestURI : /MemberProject/login.me
				
		String contextPath = request.getContextPath();
		//���ø����̼� ���
		//contextPath : /MemberProject
				
		String command = requestURI.substring(contextPath.length());
		System.out.println("command = " + command);
				
		//2. �� ��û���� ��ûó��
		//�������� ����ؼ�
		Action action = null;
		ActionForward forward = null;
		
		if(command.equals("/boardWriteForm.bo")) {
			action = new BoardWriteFormAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
		}
		else if(command.equals("/boardWritePro.bo")) {
			action = new BoardWriteProAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
		}
		else if(command.equals("/boardList.bo")) {
			action = new BoardListAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
		}
		else if(command.equals("/boardContent.bo")) {
			action = new BoardContentAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
		}
		else if(command.equals("/boardUpdateForm.bo")) {
			action = new UpdateFormAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(command.equals("/boardUpdatePro.bo")) {
			action = new UpdateProAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(command.equals("/boardDeleteForm.bo")) {
			action = new DeleteFormAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(command.equals("/boardDeletePro.bo")) {
			action = new DeleteFormProAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//3.forward ��ü�� ������ ����ؼ� ������
		if(forward != null) {
		//��ûó���� ����� ������...
			if(forward.isRedirect()) {
				response.sendRedirect(forward.getUrl());
			}
			else {
				RequestDispatcher dispatcher = 
					request.getRequestDispatcher(forward.getUrl());
				dispatcher.forward(request, response);
				}
			}
		}

			/**
			 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
			 */
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				request.setCharacterEncoding("UTF-8");
				doGet(request, response);
			}
}
