/**
 * 
 */
package com.cmepps.listatareas.infraestructure.driven_adapter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */

@Entity
@Table(name = "calendars")
public class CalendarEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public CalendarEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
