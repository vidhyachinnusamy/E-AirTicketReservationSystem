package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.cts.bean.Cancel;
import org.cts.utils.ConnectConstants;
import org.cts.utils.DaoConnection;

public class CancelDaoImpl implements CancelDao {

	@Override
	public int cancelSeat(Cancel c) {
		Connection con = null;
		PreparedStatement pst1 = null;
		boolean b = false;
		int  t1=0;
		try {
			con = DaoConnection.getConnection(ConnectConstants.DRIVER,
					ConnectConstants.URL, ConnectConstants.UNAME,
					ConnectConstants.PWD);
			pst1 = con.prepareStatement("update booking set status='cancel' where bid=?");
			pst1.setInt(1, c.getBookid());
			int rs = pst1.executeUpdate();
			pst1.close();
			PreparedStatement pst2 = con
					.prepareStatement("select fid from booking where bid=?");
			pst2.setInt(1, c.getBookid());
			ResultSet rs1 = pst2.executeQuery();
			rs1.next();
			String f = rs1.getString(1);
			pst2.close();
			PreparedStatement pst3 = con
					.prepareStatement("select ftime from flightinfo where id=?");
			pst3.setString(1, f);
			ResultSet rst2 = pst3.executeQuery();
			rst2.next();
			String time = rst2.getString(1);
			pst3.close();
			PreparedStatement pst4 = con
					.prepareStatement("select tfare from booking where bid=?");
			pst4.setInt(1, c.getBookid());
			ResultSet rst3 = pst4.executeQuery();
			rst3.next();
			int total = rst3.getInt(1);
			String format = "dd/MM/yyyy";
			SimpleDateFormat dateFormat = new SimpleDateFormat(format);
			Date date = new Date();
			String d = dateFormat.format(date);
			Date d1 = dateFormat.parse(d);
			Date d2 = dateFormat.parse(time);
			long diff = d1.getTime() - d2.getTime();
			int da = (int) (diff / (24 * 60 * 60 * 1000));
			t1 = 0;
			if (da >= 5 && da <= 10)
				t1 = (int) (total - (0.1 * 5000));
			else if (da >= 2 && da < 5)
				t1 = (int) (total - (0.2 * 5000));
			else if (da <= 1)
				t1 = (int) (total - (0.5 * 5000));
			else {
				t1 = total;
			}
			System.out.println(t1);
			if (rs > 0)
				b = true;
			else
				b = false;
			con.close();

		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return t1;
	}

}
