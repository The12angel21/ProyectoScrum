package com.cmepps.listatareas.infraestructure.driven_adapter.entity;
import javax.persistence.*;


	@Entity
	@Table(name = "asignaturas")
	public class AsignaturaEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "nombre_asignatura")
	    private String nombre;

		public AsignaturaEntity(String nombre) {
			super();
			this.nombre = nombre;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}
