package com.cmepps.listatareas.NoHexagonal.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.listatareas.NoHexagonal.model.Todo;

public interface TodoRepository extends JpaRepository < Todo, Long > {
    List < Todo > findByUserName(String user);
}