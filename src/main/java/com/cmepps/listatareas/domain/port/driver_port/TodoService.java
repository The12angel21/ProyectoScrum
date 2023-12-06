package com.cmepps.listatareas.domain.port.driver_port;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmepps.listatareas.infraestructure.driven_adapter.entity.TodoEntity;
import com.cmepps.listatareas.infraestructure.driven_adapter.repository.TodoJpaRepository;


@Service
public class TodoService implements ITodoService {

    @Autowired
    private TodoJpaRepository todoRepository;

    @Override
    public List < TodoEntity > getTodosByUser(String user) {
        return todoRepository.findByUserName(user);
    }

    @Override
    public Optional < TodoEntity > getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(TodoEntity todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(String name, String desc, Date targetDate, boolean isDone, String nameasig, String tip, String asig, String dur, String pri) {
        todoRepository.save(new TodoEntity(name, desc, targetDate, isDone, nameasig, tip, asig, dur, pri));
        
    }

    @Override
    public void deleteTodo(long id) {
        Optional < TodoEntity > todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(TodoEntity todo) {
        todoRepository.save(todo);
    }
}
