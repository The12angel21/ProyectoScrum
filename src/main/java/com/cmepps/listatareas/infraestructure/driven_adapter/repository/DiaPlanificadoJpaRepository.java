package com.cmepps.listatareas.infraestructure.driven_adapter.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.listatareas.infraestructure.driven_adapter.entity.DiaPlanificadoEntity;



public interface DiaPlanificadoJpaRepository extends JpaRepository <DiaPlanificadoEntity, Long> {
	/*   List<DiaPlanificadoEntity> findByNombre(String nombre);
	    // Otros métodos de repositorio

	    // Este método está causando el problema
	    List<DiaPlanificadoEntity> planificarTareas(String nombre);
	    */
}
