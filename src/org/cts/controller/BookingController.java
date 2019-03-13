package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cts.bean.Booking;
import org.cts.service.BookingService;
import org.cts.service.BookingServiceImpl;


@WebServlet("/BookingController")
public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    BookingService bserv=(BookingService) new BookingServiceImpl();
	
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
	   
	   PrintWriter pw=response.getWriter();
		String flight=request.getParameter("flight");
		String cid=request.getParameter("cid");
		String seat=request.getParameter("seat");
		int s=Integer.parseInt(seat);
		//System.out.println(s);
		boolean res=bserv.bookNow(new Booking(flight,cid,s));
		if(res==true)
			response.sendRedirect("Admin_home.jsp");
		else
			response.sendRedirect("Book.jsp");
		pw.close();
	}
}
