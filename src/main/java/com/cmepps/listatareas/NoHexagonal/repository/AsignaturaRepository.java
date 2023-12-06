package com.cmepps.listatareas.NoHexagonal.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.listatareas.NoHexagonal.model.*;

public interface AsignaturaRepository extends JpaRepository <Asignatura, Long> {
    List <Asignatura> findByNombre(String nombre);
}
