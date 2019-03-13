package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cts.bean.SearchFlight;
import org.cts.bean.FlightInfo;
import org.cts.service.ShowFlightService;
import org.cts.service.ShowFlightServiceImpl;


@WebServlet("/ShowFlightController")
public class ShowFlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   ShowFlightService serviceObj=new ShowFlightServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String from=request.getParameter("from");
		String to=request.getParameter("to");
		SearchFlight obj=new SearchFlight(from,to);
		List<FlightInfo> result=serviceObj.showFlightService(obj);
		request.getRequestDispatcher("Book.jsp").include(request,response);
		pw.println("<table border=1>");
		pw.println("<tr><th>AirLines Name</th><th>FlightNo</th><th>LeavingFrom</th><th>GoingTo</th><th>DepDate</th><th>DepTime</th><th>AvailableSeats</th><th>Fare</th></tr>");
		for(FlightInfo disp:result)
		{
			pw.println("<tr><td>"+disp.getName()+"</td><td>"+disp.getId()+"</td><td>"+
		disp.getStart()+"</td><td>"+disp.getEnd()+"</td><td>"+disp.getDate()+"</td><td>"+disp.getTime()+
		"</td><td>"+disp.getSeat()+"</td><td>"+disp.getFare()+"</td></tr>");
		}
		pw.println("</table>");
		
	}
	

}
