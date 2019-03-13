package org.cts.service;




import org.cts.bean.Login;
import org.cts.dao.LoginDao;
import org.cts.dao.LoginDaoImpl;

public  class LoginServiceImpl implements LoginService{
	LoginDao daoobj=(LoginDao) new LoginDaoImpl();
	public int loginService(Login l)
	{
			int res=daoobj.validate(l);
			return res;
		
	}
	
}
