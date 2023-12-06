package com.cmepps.listatareas.NoHexagonal.service;

import java.util.List;
import java.util.Optional;

import com.cmepps.listatareas.NoHexagonal.model.Asignatura;

public interface IAsignaturaService {
	List < Asignatura > getAsignaturasByNombre(String user);

    Optional < Asignatura > getAsignaturaById(long id);

    void updateAsignatura(Asignatura asig);

    boolean agregarAsignatura(String nombre);

    void deleteAsignatura(long id);

    void saveAsignatura(Asignatura asig);

}