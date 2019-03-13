package org.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import org.cts.utils.*;


public class EditDaoImpl implements EditDao{
                public int editnow(String n) {
                                //System.out.println(n);
                                Connection con=null;
                                PreparedStatement pst=null;
                                ResultSet r=null;
                                int cid=0;
                
                                try {
                                                con=DaoConnection.getConnection(ConnectConstants.DRIVER, ConnectConstants.URL, ConnectConstants.UNAME,ConnectConstants.PWD);
                                                
                                                pst=con.prepareStatement("select cus_id from customer where email=?");
                                                String user=n;
                                                pst.setString(1,user);
                                                System.out.println(pst);
                                                
                                                r=pst.executeQuery();
                                                if(r.next())
                                                {
                                                cid=r.getInt(1);
                                                System.out.println(n);
                                                }
                                                
                                                
                                                // System.out.println(cid);
                                                // System.out.println(n);
                                }
                                catch (Exception e2) {
                                                e2.printStackTrace();
                                }
                                return cid;
                }
}
