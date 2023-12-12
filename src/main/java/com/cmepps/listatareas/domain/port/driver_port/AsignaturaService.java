package com.cmepps.listatareas.domain.port.driver_port;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmepps.listatareas.domain.model.Asignatura;
import com.cmepps.listatareas.infraestructure.driven_adapter.repository.AsignaturaJpaRepository;
import com.cmepps.listatareas.infraestructure.driven_adapter.entity.*;



@Service
public class AsignaturaService implements IAsignaturaService{
    	  @Autowired
    	    private AsignaturaJpaRepository asignaturaRepository;

    	  	@Override
    	    public boolean agregarAsignatura(String nombre) {
    	        if (asignaturaRepository.findByNombre(nombre).contains(nombre)) {
    	            																	// La asignatura ya existe, mostrar mensaje de error o lanzar excepción
    	            return false;
    	       }

    	        AsignaturaEntity nuevaAsignatura = new AsignaturaEntity(nombre);

    	        //esto da error
    	        
    	        asignaturaRepository.save(nuevaAsignatura);
    	        
    	        
    	        return true;
    	    }

			@Override
			public List<AsignaturaEntity> getAsignaturasByNombre(String user) {
				return asignaturaRepository.findByNombre(user);
			}

			@Override
			public Optional<AsignaturaEntity> getAsignaturaById(long id) {
				return asignaturaRepository.findById(id);
			}

			@Override
			public void updateAsignatura(AsignaturaEntity asig) {
				asignaturaRepository.save(asig);
				
			}

			@Override
			public void deleteAsignatura(long id) {
				Optional < AsignaturaEntity > asig = asignaturaRepository.findById(id);
		        if (asig.isPresent()) {
		        	asignaturaRepository.delete(asig.get());
		        }
				
			}

			@Override
			public void saveAsignatura(AsignaturaEntity asig) {
				asignaturaRepository.save(asig);
				
			}
			
			public List<AsignaturaEntity> obtenerTodasLasAsignaturas(){
				return this.asignaturaRepository.findAll();
			}
}
