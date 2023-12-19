package com.cmepps.listatareas.domain.port.driver_port;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cmepps.listatareas.domain.model.Todo;
import com.cmepps.listatareas.infraestructure.driven_adapter.entity.TodoEntity;



public interface IDiaPlanificadoService {

	public List<TodoEntity> planificarTareas();
}
