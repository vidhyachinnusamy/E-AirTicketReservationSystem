package org.cts.dao;

import java.sql.*;

import javax.servlet.http.HttpSession;

import org.cts.bean.Updation;
import org.cts.utils.ConnectConstants;
import org.cts.utils.DaoConnection;

public class UpdateDaoImpl implements UpdateDao {
	public boolean updateData(Updation e) {
		Connection con = null;
		PreparedStatement pst = null, pst1 = null;
		boolean b = false;
		try {

			con = DaoConnection.getConnection(ConnectConstants.DRIVER,
					ConnectConstants.URL, ConnectConstants.UNAME,
					ConnectConstants.PWD);
			pst = con
					.prepareStatement("update customer set password=?,cpassword=?,dob=?,address=?,gender=?,phone=?,ssnt=?,ssnn=? where email=?");
			pst.setString(1, e.getPwd1());
			pst.setString(2, e.getPwd2());
			pst.setString(3, e.getDob());
			pst.setString(4, e.getAddress());
			pst.setString(5, e.getGender());
			pst.setString(6, e.getContact());
			pst.setInt(7, e.getSsn());
			pst.setString(8, e.getSsnname());
			pst.setString(9, e.getEmail());
			int r = pst.executeUpdate();
			pst.close();
			pst1 = con.prepareStatement("update users set pwd=? where id=?");
			pst1.setString(1, e.getPwd1());
			pst1.setString(2, e.getEmail());
			pst1.executeUpdate();
			pst1.close();
			if (r > 0)
				b = true;
			else
				b = false;
			con.close();

		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return b;
	}

}
