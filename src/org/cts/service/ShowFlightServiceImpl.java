package org.cts.service;

import java.util.List;

import org.cts.bean.SearchFlight;
import org.cts.dao.ShowFlightDao;
import org.cts.dao.ShowFlightDaoImpl;

public class ShowFlightServiceImpl implements ShowFlightService {
	ShowFlightDao daoobj=new ShowFlightDaoImpl();
	@Override
	public List showFlightService(SearchFlight obj) {
		List res=daoobj.showFlightInfo(obj);
		return res;
	}

}
