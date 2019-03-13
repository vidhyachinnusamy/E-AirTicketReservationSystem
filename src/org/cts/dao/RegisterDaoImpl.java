package org.cts.dao;

import java.sql.Connection;
import java.sql.*;

import org.cts.bean.Registration;
import org.cts.utils.ConnectConstants;
import org.cts.utils.DaoConnection;

public class RegisterDaoImpl implements RegisterDao{
	public boolean registerData(Registration e) {
		Connection con=null;
		PreparedStatement pst=null,pst1=null;
		boolean b=false;
		try {
		con=DaoConnection.getConnection(ConnectConstants.DRIVER, ConnectConstants.URL, ConnectConstants.UNAME,ConnectConstants.PWD);
		pst=con.prepareStatement("insert into customer(name,email,password,cpassword,dob,address,gender,phone,ssnt,ssnn) values(?,?,?,?,?,?,?,?,?,?)");
		pst.setString(1,e.getName());
		pst.setString(2,e.getMail());
		pst.setString(3,e.getPwd1());
		pst.setString(4,e.getPwd2());
		pst.setString(5,e.getDob());
		pst.setString(6,e.getAddress());
		pst.setString(7,e.getGender());
		pst.setString(8,e.getContact());
		pst.setInt(9,e.getSsn());
		pst.setString(10,e.getSsnname());
		int r=pst.executeUpdate();
		pst.close();
		pst1=con.prepareStatement("insert into users(role,id,pwd) values('user',?,?)");
		pst1.setString(1,e.getMail());
		pst1.setString(2,e.getPwd1());
		pst1.executeUpdate();
		pst1.close();
		if(r>0)
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
