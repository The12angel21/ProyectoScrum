package com.cmepps.listatareas.NoHexagonal.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cmepps.listatareas.NoHexagonal.model.Todo;

public interface IPlanificacionService {

	public List<Todo> planificarTareas();

	public void manejarConflicto(Todo tareaNueva);

}
