package com.cmepps.listatareas.domain.port.driver_port;

import java.util.Date;

public interface ICalendarService {

	public Date calculaPrimerDiaSemana(Date fecha); 
	
	public Date calculaSiguienTeDia(Date fecha);
}
