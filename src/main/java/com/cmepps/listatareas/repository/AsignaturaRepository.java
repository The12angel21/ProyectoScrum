package com.cmepps.listatareas.repository;
import  com.cmepps.listatareas.model.*;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturaRepository extends JpaRepository <Asignatura, Long> {
    List <Asignatura> findByNombre(String nombre);
}
