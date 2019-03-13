package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.cts.bean.FlightInfo;
import org.cts.bean.SearchFlight;
import org.cts.bean.ShowInvoice;
import org.cts.utils.ConnectConstants;
import org.cts.utils.DaoConnection;

public class ShowInvoiceDaoImpl implements ShowInvoiceDao {

	@Override
	public List showInvoice() {
		Statement st = null;
		PreparedStatement rs = null;
		List<ShowInvoice> fobj = new ArrayList<>();

		try {
			Connection con = DaoConnection.getConnection(
					ConnectConstants.DRIVER, ConnectConstants.URL,
					ConnectConstants.UNAME, ConnectConstants.PWD);
			st = (Statement) con.createStatement();
			rs = con.prepareStatement("select bid,fid,fromp,top,ftime,ttime,tfare,seats,status,date from flightinfo INNER JOIN booking  on flightinfo.id=booking.fid");

			ResultSet rst = rs.executeQuery();
			while (rst.next()) {
				fobj.add(new ShowInvoice(rst.getInt(1), rst.getString(2), rst
						.getString(3), rst.getString(4), rst.getString(5), rst
						.getString(6), rst.getInt(7), rst.getInt(8),rst.getString(9),rst.getString(10)));
			}
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fobj;
	}

}
