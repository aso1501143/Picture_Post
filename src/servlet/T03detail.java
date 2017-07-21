package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CommentsDAO;
import model.Comments;

/**
 * Servlet implementation class T02detail
 */
@WebServlet("/T03detail")
public class T03detail extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public T03detail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		request.setCharacterEncoding("UTF-8");

		CommentsDAO commentsdao = new CommentsDAO();
		ArrayList<Comments> commentList = commentsdao.getComment();

		request.setAttribute("comment", commentList);

		RequestDispatcher rd = request.getRequestDispatcher("/T02-01Detail.jsp");
		rd.forward(request, response);
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		int postid = 1;
		String comment = request.getParameter("comment");

		//コメント挿入
		CommentsDAO commentsDao = new CommentsDAO();
		commentsDao.insertComment(postid,comment);

		//コメント受け取り
		CommentsDAO commentsdao = new CommentsDAO();
		ArrayList<Comments> commentList = commentsdao.getComment();

		request.setAttribute("comment", commentList);

		RequestDispatcher rd = request.getRequestDispatcher("/T02-01Detail.jsp");
		rd.forward(request, response);
	}

}
