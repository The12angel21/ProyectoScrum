package com.cmepps.listatareas.infraestructure.driven_adapter.repository;

import java.util.List;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.listatareas.infraestructure.driven_adapter.entity.TodoEntity;

public interface TodoJpaRepository extends JpaRepository < TodoEntity, Long > {
    List < TodoEntity > findByUserName(String user);
    List <TodoEntity> getTodosByDate(Date targetDate);
}