package org.cts.service;

import org.cts.bean.Booking;
import org.cts.dao.BookingDao;
import org.cts.dao.BookingDaoImpl;

public class BookingServiceImpl implements BookingService{
BookingDao obj=(BookingDao) new BookingDaoImpl();
public boolean bookNow(Booking b)
{
	boolean res=obj.bookSeat(b);
	return res;
}
}
