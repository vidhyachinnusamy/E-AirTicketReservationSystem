package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.cts.service.EditService;
import org.cts.service.EditServiceImpl;

@WebServlet("/EditControl")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EditService serviceObj3 = (EditService) new EditServiceImpl();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher rd = null;
		HttpSession session = request.getSession(false);
		String n = (String) session.getAttribute("n");
		int res;
		res = serviceObj3.editServicer(n);
		request.setAttribute("cid", res);
		request.setAttribute("n", n);
		rd = request.getRequestDispatcher("Edit_custom.jsp");
		rd.forward(request, response);

	}

}
