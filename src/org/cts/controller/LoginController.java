package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.cts.bean.Login;
import org.cts.service.LoginService;
import org.cts.service.LoginServiceImpl;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginService serviceObj1 = (LoginService) new LoginServiceImpl();

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("uemail");
		String upwd = request.getParameter("upwd");
		int res = -1;
		HttpSession session = request.getSession(); /* Creating a new session */
		session.setAttribute("n", uname);

		res = serviceObj1.loginService(new Login(uname, upwd));
		if (res == 1)
			response.sendRedirect("Admin_home.jsp");

		if (res == 2)
			response.sendRedirect("User_home.jsp");
		pw.close();
	}

}
