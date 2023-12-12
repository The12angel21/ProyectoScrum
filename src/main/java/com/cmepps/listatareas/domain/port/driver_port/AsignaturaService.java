package com.cmepps.listatareas.domain.port.driver_port;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmepps.listatareas.domain.model.Asignatura;
import com.cmepps.listatareas.infraestructure.driven_adapter.repository.AsignaturaJpaRepository;




@Service
public class AsignaturaService implements IAsignaturaService{
    	  @Autowired
    	    private AsignaturaJpaRepository asignaturaRepository;

    	  	@Override
    	    public boolean agregarAsignatura(String nombre) {/*
    	        if (asignaturaRepository.findByNombre(nombre).EstaEnLaLista()) {
    	            																	// La asignatura ya existe, mostrar mensaje de error o lanzar excepción
    	            return false;
    	       }*/

    	        Asignatura nuevaAsignatura = new Asignatura(nombre);

    	        //esto da error
    	        
    	        //asignaturaRepository.save(nuevaAsignatura);
    	        
    	        
    	        return true;
    	    }

			@Override
			public List<Asignatura> getAsignaturasByNombre(String user) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Optional<Asignatura> getAsignaturaById(long id) {
				// TODO Auto-generated method stub
				return Optional.empty();
			}

			@Override
			public void updateAsignatura(Asignatura asig) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void deleteAsignatura(long id) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void saveAsignatura(Asignatura asig) {
				// TODO Auto-generated method stub
				
			}
}
