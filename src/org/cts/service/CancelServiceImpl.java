package org.cts.service;

import org.cts.bean.Cancel;
import org.cts.dao.CancelDao;
import org.cts.dao.CancelDaoImpl;

public class CancelServiceImpl implements CancelService {
	CancelDao obj=new CancelDaoImpl();
	@Override
	public int cancelNow(Cancel cancel) {
		int res=obj.cancelSeat(cancel);
		return res;
	}

}
