package com.cmepps.listatareas.domain.port.driver_port;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmepps.listatareas.domain.model.Todo;
import com.cmepps.listatareas.domain.port.driven_port.*;
import com.cmepps.listatareas.infraestructure.driven_adapter.entity.DiaPlanificadoEntity;
import com.cmepps.listatareas.infraestructure.driven_adapter.entity.TodoEntity;
import com.cmepps.listatareas.infraestructure.driven_adapter.repository.TodoJpaRepository;



@Service
public class DiaPlanificadoService implements IDiaPlanificadoService{
	
	@Autowired
    private TodoJpaRepository tareaRepository;
	
	@Override
    public List<TodoEntity> planificarTareas() {
    	List<TodoEntity> Ordenado = null;
        // Lógica de planificación aquí (ordenar por fecha y prioridad)
        return Ordenado;
    }

}
