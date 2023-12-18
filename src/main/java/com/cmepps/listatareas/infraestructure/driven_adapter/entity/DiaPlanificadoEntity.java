package com.cmepps.listatareas.infraestructure.driven_adapter.entity;
import java.util.Collections;
import java.util.List;

import javax.persistence.*;

import com.cmepps.listatareas.domain.model.Todo;


	@Entity
	@Table(name = "DiasPlanificados")
	public class DiaPlanificadoEntity {
		
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	  //  private String[] tareasEnElDia = new String[6];

	    public DiaPlanificadoEntity() {
			super();
		//	llenarTareas();
		}
	   /* 
	    public void llenarTareas() {
	    	for(int i = 0; i < 6; i++) {
	    		tareasEnElDia[i] = "";
	    	}
	   
	    /*
	    public List<Todo> planificarTareas(String someParameter) {
	        // Implementación aquí
	        // Puedes devolver una lista vacía o lanzar UnsupportedOperationException por ahora
	        return Collections.emptyList();
	    }
	    
	    public void insertarTarea(int pos, String tarea) {
	    //	tareasEnElDia[pos] = tarea;
	    }
	    
	    public void eliminarTarea(int pos, String tarea) {
	    	//tareasEnElDia[pos] = "";
	    }
	    
		public DiaPlanificadoEntity(String nombre) {
			super();
		//	llenarTareas();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
		//	this.id = id;
		}
*/
}
