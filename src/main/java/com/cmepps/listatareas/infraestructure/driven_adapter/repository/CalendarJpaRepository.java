package com.cmepps.listatareas.infraestructure.driven_adapter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.listatareas.infraestructure.driven_adapter.entity.CalendarEntity;

public interface CalendarJpaRepository extends JpaRepository < CalendarEntity, Long >{

}
