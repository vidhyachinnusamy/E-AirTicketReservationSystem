package org.cts.service;

import org.cts.bean.Updation;
import org.cts.dao.UpdateDao;
import org.cts.dao.UpdateDaoImpl;


public class UpdateServiceImpl implements UpdateService{
	UpdateDao daoobj1=(UpdateDao) new UpdateDaoImpl();
	public boolean CustomerUpdationService(Updation r)
	{
			boolean res=daoobj1.updateData(r);
			return res;
		
	}
}
