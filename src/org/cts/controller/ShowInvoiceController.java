package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.cts.bean.ShowInvoice;
import org.cts.service.ShowInvoiceService;
import org.cts.service.ShowInvoiceServiceImpl;

@WebServlet("/ShowInvoice")
public class ShowInvoiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShowInvoiceService serviceObj = new ShowInvoiceServiceImpl();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession(false);
		String n = (String) session.getAttribute("n");
		String format = "dd/MM/yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		Date date = new Date();
		String d = dateFormat.format(date);
		List<ShowInvoice> result = serviceObj.showInvoiceService();
		pw.println("<center><h1> Booking Invoice</h1></center>");
		pw.println("<center><table border=1>");
		pw.println("<tr><th>Booking Id</th><th>Airlines Name</th><th>Customer</th><th>LeavingFrom</th><th>GoingTo</th><th>Date of Journey</th><th>DepTime</th><th>Booking Date</th><th>Total Price</th><th>Seats Booked</th><th> Status</th></tr>");
		for (ShowInvoice disp : result) {
			pw.println("<tr><td>" + disp.getBid() + "</td><td>" + disp.getFid()+"</td><td>"+n
					+ "</td><td>" + disp.getFrom() + "</td><td>" + disp.getTo()
					+ "</td><td>" + disp.getDoj() + "</td><td>"
					+ disp.getDtime() + "</td><td>"+disp.getDate()+ "</td><td>"+ disp.getTfare()
					+ "</td><td>" + disp.getSeats() + "</td><td>"
					+ disp.getStatus() + "</td></tr>");
		}
		pw.println("</table></center>");

	}

}
