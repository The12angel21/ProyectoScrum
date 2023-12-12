package com.cmepps.listatareas.domain.port.driver_port;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cmepps.listatareas.infraestructure.driven_adapter.entity.TodoEntity;


/**
 * esto es un driver port
 */
public interface ITodoService {

    List < TodoEntity > getTodosByUser(String user);

    Optional < TodoEntity > getTodoById(long id);

    void updateTodo(TodoEntity todo);

    //void addTodo(String name, String desc, Date targetDate, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(TodoEntity todo);

	void addTodo(String name, String desc, Date targetDate, boolean isDone, String nameasig, String tip, String asig,
			String dur, String pri);
}
