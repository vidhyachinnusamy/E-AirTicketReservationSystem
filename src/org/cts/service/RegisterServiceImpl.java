package org.cts.service;

import org.cts.bean.Registration;
import org.cts.dao.RegisterDao;
import org.cts.dao.RegisterDaoImpl;

public class RegisterServiceImpl implements RegisterService{
	RegisterDao daoobj1=(RegisterDao) new RegisterDaoImpl();
	public boolean CustomerRegistrationService(Registration r)
	{
			boolean res=daoobj1.registerData(r);
			return res;
		
	}
}
