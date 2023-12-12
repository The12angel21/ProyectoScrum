package com.cmepps.listatareas.domain.port.driver_port;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cmepps.listatareas.domain.model.Todo;
import com.cmepps.listatareas.infraestructure.driven_adapter.entity.TodoEntity;



public interface IPlanificacionService {

	public List<TodoEntity> planificarTareas();

	public void manejarConflicto(Todo tareaNueva);

}
