package com.cmepps.listatareas.infraestructure.ui_driver_adapter_rest.controller;

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

import com.cmepps.listatareas.domain.model.Todo;
import com.cmepps.listatareas.domain.port.driver_port.DiaPlanificadoService;
import com.cmepps.listatareas.infraestructure.driven_adapter.entity.DiaPlanificadoEntity;



@Controller
public class DiaPlanificadoController {
	@Autowired
    private DiaPlanificadoService planiService;

	@RequestMapping(value = "/planificar-tareas", method = RequestMethod.POST)
    public String planificarTareas(ModelMap model) {
		
        List<DiaPlanificadoEntity> tareasPlanificadas = planiService.planificarTareas();
        model.addAttribute("tareas", tareasPlanificadas);
        return "planificar-tareas"; // Página para visualizar tareas planificadas
    }
	
    @RequestMapping(value = "/planificar-tareas", method = RequestMethod.GET)
    public String mostrarPlanificacionTareas() {
        return "planificar-tareas";
    }
}
