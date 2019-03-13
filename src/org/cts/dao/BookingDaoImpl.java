package org.cts.dao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.cts.bean.Booking;
import org.cts.utils.ConnectConstants;
import org.cts.utils.DaoConnection;

public class BookingDaoImpl implements BookingDao{
	public boolean bookSeat(Booking e) {
		Connection con=null;
		PreparedStatement pst1=null;
		boolean b=false;
		try {
		con=DaoConnection.getConnection(ConnectConstants.DRIVER, ConnectConstants.URL, ConnectConstants.UNAME,ConnectConstants.PWD);
		pst1=con.prepareStatement("select fare from flightinfo where id=?");
		pst1.setString(1,e.getFlight());
		ResultSet rst=pst1.executeQuery();
		rst.next();
		String format = "dd/MM/yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		Date date = new Date();
		String d = dateFormat.format(date);
		
		int fare= rst.getInt(1);
		System.out.println(fare);
		int s=e.getSeat();
		int total=s*fare;
		System.out.println(total);
		pst1.close();
		PreparedStatement pst2 = con.prepareStatement("insert into booking(cid,fid,seats,tfare,date,status) values(?,?,?,?,?,'active')");
		pst2.setString(1,e.getCid());
		pst2.setString(2,e.getFlight());
		pst2.setInt(3,s);
		pst2.setInt(4,total);
		pst2.setString(5,d);
		int r=pst2.executeUpdate();
		pst2.close();
		PreparedStatement pst3 = con.prepareStatement("select seat from flightinfo where id=?");
		pst3.setString(1,e.getFlight());
		ResultSet rst1=pst3.executeQuery();
		rst1.next();
		int seats=rst1.getInt(1);
		int present=seats-s;
		pst3.close();
		PreparedStatement pst4 = con.prepareStatement("update flightinfo set seat=? where id=?");
		pst4.setInt(1,present);
		pst4.setString(2,e.getFlight());
		int r1=pst4.executeUpdate();
		pst4.close();
		if(r1>0 && r>0)
			b=true;
		else
			b=false;
		con.close();
		
	} catch (Exception e2) {
		e2.printStackTrace();
	}
	return b;
	}
}
