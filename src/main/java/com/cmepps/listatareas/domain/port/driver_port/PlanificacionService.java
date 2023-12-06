package com.cmepps.listatareas.domain.port.driver_port;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmepps.listatareas.domain.model.Todo;
import com.cmepps.listatareas.domain.port.driven_port.TodoRepository;



@Service
public class PlanificacionService implements IPlanificacionService{
	@Autowired
    private TodoRepository tareaRepository;

    public List<Todo> planificarTareas() {
    	List<Todo> Ordenado = null;
        // Lógica de planificación aquí (ordenar por fecha y prioridad)
        return Ordenado;
    }

    public void manejarConflicto(Todo tareaNueva) {
        // Lógica para manejar conflictos de horarios y prioridades
        // Puedes preguntar al usuario cuál tarea mantener en caso de conflicto
        // y ajustar las fechas o prioridades según sea necesario
    }
}
