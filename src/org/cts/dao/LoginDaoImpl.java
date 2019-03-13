package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.cts.bean.Login;
import org.cts.utils.ConnectConstants;
import org.cts.utils.DaoConnection;

public class LoginDaoImpl implements LoginDao{
	
	public int validate(Login l) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		int flag=-1;
		
		try {
			con=DaoConnection.getConnection(ConnectConstants.DRIVER, ConnectConstants.URL, ConnectConstants.UNAME,ConnectConstants.PWD);
			pst=con.prepareStatement("select * from  users");
			rs=pst.executeQuery();
			String name=l.getName();
			String pwd=l.getPwd();
			while(rs.next())
			{
			
				String role=rs.getString(1);
				String n=rs.getString(2);
				String p=rs.getString(3);
				if(role.equals("admin"))
				{ if(name.equals(n) && pwd.equals(p)) 
					{
						 flag=1; 
					}
				
				}
				if(role.equals("user"))
				{ if(name.equals(n) && pwd.equals(p)) 
					{
						 flag=2; 
					}
				
				}	
			}
			
			con.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return flag;
	}
	
}
