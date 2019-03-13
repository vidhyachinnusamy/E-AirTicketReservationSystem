package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cts.bean.Registration;
import org.cts.service.RegisterService;
import org.cts.service.RegisterServiceImpl;



@WebServlet("/CustomerRegistration")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    RegisterService serviceObj2= (RegisterService) new RegisterServiceImpl();   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("uname");
		String mail=request.getParameter("mail");
		String pwd1=request.getParameter("pwd1");
		String pwd2=request.getParameter("pwd2");
		String dob=request.getParameter("dob");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		String contact=request.getParameter("contact");
		int ssn=Integer.parseInt(request.getParameter("ssnt"));
		String ssnname=request.getParameter("ssnn");
		boolean res=serviceObj2.CustomerRegistrationService(new Registration(name,mail,pwd1,pwd2,dob,address,gender,contact,ssn,ssnname));
		if(res==true)
			response.sendRedirect("Admin_home.jsp");
		else
			response.sendRedirect("Register.jsp");
		pw.close();
	}

}
