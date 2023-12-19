package com.cmepps.listatareas.infraestructure.ui_driver_adapter_rest.controller;


import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cmepps.listatareas.domain.port.driver_port.CalendarService;
import com.cmepps.listatareas.domain.port.driver_port.TodoService;
import com.cmepps.listatareas.infraestructure.driven_adapter.entity.TodoEntity;

@Controller
public class CalendarController {

	@Autowired
    private TodoService  todoService;
	@Autowired
    private CalendarService  calendarService;
	
	@GetMapping("/calendar")
    public String showEditTodo(/*@RequestParam long id,*/ ModelMap model) {
        /*Optional<TodoEntity> todo = todoService.getTodoById(id);
        
        // para que muestre las asginaturas del desplegable:
        List<String> asignaturas = todoService.getAllAsignaturas();
        model.addAttribute("asignaturas", asignaturas);
        model.addAttribute("todo", todo.orElse(null));
		*/
        return "calendar";
    }
	
	@PostMapping("/calendar-week")
	public String showWeekCalendar(ModelMap model, @RequestParam("targetDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date targetDate) {
		//System.out.println("############"+targetDate.toString());
		Date lunes = calendarService.calculaPrimerDiaSemana(targetDate);
		Date martes = calendarService.calculaSiguienTeDia(lunes);
		Date miercoles = calendarService.calculaSiguienTeDia(martes);
		Date jueves = calendarService.calculaSiguienTeDia(miercoles);
		Date viernes = calendarService.calculaSiguienTeDia(jueves);
		Date sabado = calendarService.calculaSiguienTeDia(viernes);
		Date domingo = calendarService.calculaSiguienTeDia(sabado);
		
		List<TodoEntity> todoLunes = todoService.getTodosByDate(lunes);
		List<TodoEntity> todoMartes = todoService.getTodosByDate(martes);
		List<TodoEntity> todoMiercoles = todoService.getTodosByDate(miercoles);
		List<TodoEntity> todoJueves = todoService.getTodosByDate(jueves);
		List<TodoEntity> todoViernes = todoService.getTodosByDate(viernes);
		List<TodoEntity> todoSabado = todoService.getTodosByDate(sabado);
		List<TodoEntity> todoDomingo = todoService.getTodosByDate(domingo);
		
		model.addAttribute("lunes", todoLunes);
		model.addAttribute("martes", todoMartes);
		model.addAttribute("miercoles", todoMiercoles);
		model.addAttribute("jueves", todoJueves);
		model.addAttribute("viernes", todoViernes);
		model.addAttribute("sabado", todoSabado);
		model.addAttribute("domingo", todoDomingo);
		
		
		
		
		return "calendar";
	}
	
	
}
