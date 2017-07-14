package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminDAO;
import model.Admin;

/**
 * Servlet implementation class A01ManagerLogin
 */
@WebServlet("/A01ManagerLogin")
public class A01ManagerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public A01ManagerLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		RequestDispatcher rd = request.getRequestDispatcher("/A02Review.jsp");
		rd.forward(request, response);



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		String path;

		HttpSession session = request.getSession();

		request.setCharacterEncoding("UTF-8");
		String adminid = request.getParameter("adminid");
		String password = request.getParameter("password");

		AdminDAO admindao = new AdminDAO();
		Admin admin = new Admin();

		admin = admindao.getAdmin(adminid, password);

		if (admin != null){
			System.out.println("ログイン成功");
			//
			session.setAttribute("CommmonLoginUser", admin);
			//
			path  = "/A02Review.jsp";

		}else{
			System.out.println("ログイン失敗");
			request.setAttribute("errorMessage", "会員IDまたはパスワードが違います。");
			path = "/Managertop.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);

	}

}

