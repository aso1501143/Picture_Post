package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CommentsDAO;
import model.Comments;

/**
 * Servlet implementation class T0201DetailRetrieve
 */
@WebServlet("/T0201DetailRetrieve")
public class T0201DetailRetrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public T0201DetailRetrieve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

			CommentsDAO dao = new CommentsDAO();
			List<Comment> commentList = dao.findAll();

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		HttpSession session = request.getSession(false);

		Comments regidata = (Comments)session.getAttribute("T0201DetailRetrieve");

		CommentsDAO commentsDao = new CommentsDAO();
		commentsDao.insertData(regidata);

		session.setAttribute("regisemi", regidata);

		RequestDispatcher rd = request.getRequestDispatcher("/PicturePost/WebContent/T02-01Detail.jsp");
		rd.forward(request, response);
	}

}
