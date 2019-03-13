package org.cts.service;

import org.cts.dao.EditDao;
import org.cts.dao.EditDaoImpl;

public class EditServiceImpl implements EditService{
	EditDao daoobj1=(EditDao) new EditDaoImpl();
    
    public int editServicer(String n) {
                    
                    int res=daoobj1.editnow(n);
                    return res;
    }

}
