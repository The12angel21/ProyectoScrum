package com.cmepps.listatareas.NoHexagonal.model;
import javax.persistence.*;


	@Entity
	@Table(name = "asignaturas")
	public class Asignatura {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "nombre asignatura")
	    private String nombre;

		public Asignatura(String nombre) {
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
