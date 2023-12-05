package com.cmepps.listatareas.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cmepps.listatareas.model.Todo;
import com.cmepps.listatareas.service.PlanificacionService;

@Controller
public class PlanificarController {
	@Autowired
    private PlanificacionService planiService;

	@RequestMapping(value = "/planificar-tareas", method = RequestMethod.POST)
    public String planificarTareas(ModelMap model) {
        List<Todo> tareasPlanificadas = planiService.planificarTareas();
        model.addAttribute("tareas", tareasPlanificadas);
        return "planificacion-tareas"; // Página para visualizar tareas planificadas
    }
}
