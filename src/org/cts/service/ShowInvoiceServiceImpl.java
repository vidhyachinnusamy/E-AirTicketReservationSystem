package org.cts.service;



import java.util.List;

import org.cts.bean.ShowInvoice;
import org.cts.dao.ShowInvoiceDao;
import org.cts.dao.ShowInvoiceDaoImpl;

public class ShowInvoiceServiceImpl implements ShowInvoiceService {
	ShowInvoiceDao obj=(ShowInvoiceDao) new ShowInvoiceDaoImpl();
	
	@Override
	public List showInvoiceService() {
		List res = obj.showInvoice();
		return res;
	}

}
