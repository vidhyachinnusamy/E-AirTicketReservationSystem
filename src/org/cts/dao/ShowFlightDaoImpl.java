package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.cts.bean.SearchFlight;
import org.cts.bean.FlightInfo;
import org.cts.dao.ShowFlightDao;
import org.cts.utils.ConnectConstants;
import org.cts.utils.DaoConnection;

public class ShowFlightDaoImpl implements ShowFlightDao {

	@Override
	public List showFlightInfo(SearchFlight disp) {
		Statement st=null;
		PreparedStatement rs=null;
		List<FlightInfo> fobj= new ArrayList<>();
		
		try {
			Connection con = DaoConnection.getConnection(ConnectConstants.DRIVER, ConnectConstants.URL, ConnectConstants.UNAME,ConnectConstants.PWD);
			st=(Statement) con.createStatement();
			rs=con.prepareStatement("select * from flightinfo where fromp=? and top=?");
			String f=disp.getFrom();
			String t=disp.getTo();
			rs.setString(1,f);
			rs.setString(2,t);
			ResultSet rst=rs.executeQuery();
			while(rst.next())
			{
			fobj.add(new FlightInfo(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5),rst.getString(6),rst.getInt(7),rst.getInt(8)));
			}
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fobj;
	}

}
