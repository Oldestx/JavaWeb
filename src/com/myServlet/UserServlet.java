package com.myServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myBean.UserBean;
import com.myDao.UserDaoImp;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 解决字符编码问题
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		// 获取提交对象
		String name = request.getParameter("name");
		String telephone =request.getParameter("telephone");
		String content = request.getParameter("text");

		//System.out.println("name="+name);

		// 创建UserBean对象，并设值
		UserBean ub = new UserBean();
		ub.setName(name);
		ub.setTelephone(telephone);
		ub.setContent(content);
		
		// System.out.println(ub.getUserID());

		// 创建UserDaoImp的对象，写入提交数据，并判断是否写入
		UserDaoImp udi = new UserDaoImp();

		boolean result = udi.add(ub);
		if (result == true) {
			response.sendRedirect("addSucess.jsp");
		} else {
			response.sendRedirect("addUserfail.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
