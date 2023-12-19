package com.cmepps.listatareas.domain.port.driver_port;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class CalendarService implements ICalendarService{

	@Override
	public Date calculaSiguienTeDia(Date fecha) {
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_MONTH, 1); // suma un dia
        return calendar.getTime();		
	}

	@Override
	public Date calculaPrimerDiaSemana(Date fecha) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            calendar.add(Calendar.DAY_OF_MONTH, -1);
        }
		return calendar.getTime();
	}
	

}
