package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import javax.servlet.http.HttpSession;

import org.cts.bean.Updation;
import org.cts.service.UpdateService;
import org.cts.service.UpdateServiceImpl;



@WebServlet("/CustomerUpdation")
public class UpdationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UpdateService serviceObj2= (UpdateService) new UpdateServiceImpl();   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
	   HttpSession session = request.getSession(false);
		String n = (String) session.getAttribute("n");
		PrintWriter pw=response.getWriter();
		String pwd1=request.getParameter("pwd1");
		String pwd2=request.getParameter("pwd2");
		String dob=request.getParameter("dob");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		String contact=request.getParameter("contact");
		int ssn=Integer.parseInt(request.getParameter("ssnt"));
		String ssnname=request.getParameter("ssnn");
		boolean res=serviceObj2.CustomerUpdationService(new Updation(pwd1,pwd2,dob,address,gender,contact,ssn,ssnname,n));
		if(res==true)
			response.sendRedirect("User_home.jsp");
		else
			response.sendRedirect("Edit_custom.jsp");
		pw.close();
	}

}
