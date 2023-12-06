package com.cmepps.listatareas.infraestructure.driven_adapter.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.listatareas.infraestructure.driven_adapter.entity.AsignaturaEntity;



public interface AsignaturaRepository extends JpaRepository <AsignaturaEntity, Long> {
    List <AsignaturaEntity> findByNombre(String nombre);
}
