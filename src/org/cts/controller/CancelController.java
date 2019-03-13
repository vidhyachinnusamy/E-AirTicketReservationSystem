package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cts.bean.Booking;
import org.cts.bean.Cancel;
import org.cts.service.BookingService;
import org.cts.service.BookingServiceImpl;
import org.cts.service.CancelService;
import org.cts.service.CancelServiceImpl;

@WebServlet("/CancelController")
public class CancelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CancelService bserv = new CancelServiceImpl();

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int res = 0;
		PrintWriter pw = response.getWriter();
		String book_id = request.getParameter("bookid");
		int b = Integer.parseInt(book_id);
		res = bserv.cancelNow(new Cancel(b));
		pw.println("<h2>Cancellation Done! Refundable amount : </h2>" + res);
		
		pw.close();
	}

}
