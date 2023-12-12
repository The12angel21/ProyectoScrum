package com.cmepps.listatareas.domain.port.driver_port;

import java.util.List;
import java.util.Optional;

import com.cmepps.listatareas.domain.model.Asignatura;
import com.cmepps.listatareas.infraestructure.driven_adapter.entity.*;


public interface IAsignaturaService {
	List < AsignaturaEntity > getAsignaturasByNombre(String user);

    Optional < AsignaturaEntity > getAsignaturaById(long id);

    void updateAsignatura(AsignaturaEntity asig);

    boolean agregarAsignatura(String nombre);

    void deleteAsignatura(long id);

    void saveAsignatura(AsignaturaEntity asig);

}
