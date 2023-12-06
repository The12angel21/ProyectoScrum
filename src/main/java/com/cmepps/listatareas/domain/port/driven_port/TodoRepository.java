package com.cmepps.listatareas.domain.port.driven_port;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.listatareas.infraestructure.driven_adapter.entity.TodoEntity;

public interface TodoRepository extends JpaRepository < TodoEntity, Long > {
    List < TodoEntity > findByUserName(String user);
}