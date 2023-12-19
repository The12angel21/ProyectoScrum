package com.cmepps.listatareas.infraestructure.ui_driver_adapter_rest.controller;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cmepps.listatareas.domain.port.driver_port.ITodoService;
import com.cmepps.listatareas.infraestructure.driven_adapter.JpaTodoRepository;
import com.cmepps.listatareas.infraestructure.driven_adapter.entity.TodoEntity;


/**
 * esta clase es un driver_Adapter
 */
@Controller
public class TodoController {

    @Autowired
    private ITodoService todoService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // Date - dd/MM/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showTodos(ModelMap model) {
        String name = getLoggedInUserName(model);
        model.put("todos", todoService.getTodosByUser(name));
        // model.put("todos", service.retrieveTodos(name));
        return "list-todos";
    }

    @RequestMapping(value = "/list-todosByDate", method = RequestMethod.GET)
    public String showTodosByDate(ModelMap model) {
        String name = getLoggedInUserName(model);
        List<TodoEntity> todosOrdenadas = todoService.getTodosByUser(name);
        
        //Ordenar la lista de tareas por fecha
        Collections.sort(todosOrdenadas, Comparator.comparing(TodoEntity::getTargetDate));
        
        model.put("todos", todosOrdenadas);
        // model.put("todos", service.retrieveTodos(name));
        return "list-todosByDate";
    }
    
    private String getLoggedInUserName(ModelMap model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }

        return principal.toString();
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showAddTodoPage(ModelMap model) {
    	List<String> asignaturas = todoService.getAllAsignaturas();
    	System.out.println("ASIGNATURAS: " + asignaturas);
    	model.addAttribute("asignaturas", asignaturas);
        model.addAttribute("todo", new TodoEntity());
        return "todo";
    }

    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam long id) {
        todoService.deleteTodo(id);
        // service.deleteTodo(id);
        return "redirect:/list-todos";
    }


    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @Validated TodoEntity todo, BindingResult result) {

        if (result.hasErrors()) {
            return "todo";
        }

        todo.setUserName(getLoggedInUserName(model));
        todoService.saveTodo(todo);
        return "redirect:/list-todos";
    }
    
    @GetMapping("/edit-todo")
    public String showEditTodo(@RequestParam long id, ModelMap model) {
        Optional<TodoEntity> todo = todoService.getTodoById(id);
        
        // para que muestre las asginaturas del desplegable:
        List<String> asignaturas = todoService.getAllAsignaturas();
        model.addAttribute("asignaturas", asignaturas);
        model.addAttribute("todo", todo.orElse(null));

        return "edit-todo";
    }

    @PostMapping("/update-todo")
    public String updateTodo(@ModelAttribute("todo") TodoEntity updateTodo) {
        // Lógica para actualizar la tarea con los datos proporcionados en el formulario
        // Verifica si la tarea existe y actualiza sus campos con los valores del formulario
        Optional<TodoEntity> todoOptional = todoService.getTodoById(updateTodo.getId());

        if (todoOptional.isPresent()) {
        	TodoEntity todo = todoOptional.get();
        	// actualizamos los campos:
        	todo.setNombre(updateTodo.getNombre());
        	todo.setAsignatura(updateTodo.getAsignatura());
        	todo.setTipo(updateTodo.getTipo());
        	todo.setTargetDate(updateTodo.getTargetDate());
        	todo.setDuracion(updateTodo.getDuracion());
        	todo.setDescription(updateTodo.getDescription());
        	todo.setPrioridad(updateTodo.getPrioridad());
        	todoService.saveTodo(todo);
        	return "redirect:/list-todos"; 
        } else {
            // Manejar el caso donde la tarea no existe
            // Puedes lanzar una excepción, loggear un mensaje, etc.
            return "error"; // Puedes redirigir a una página de error
        }        
    }
}    