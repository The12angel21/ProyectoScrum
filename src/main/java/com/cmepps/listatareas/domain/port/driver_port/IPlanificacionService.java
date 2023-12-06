package com.cmepps.listatareas.domain.port.driver_port;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cmepps.listatareas.domain.model.Todo;



public interface IPlanificacionService {

	public List<Todo> planificarTareas();

	public void manejarConflicto(Todo tareaNueva);

}
