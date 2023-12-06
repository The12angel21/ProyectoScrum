package com.cmepps.listatareas.NoHexagonal.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

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

import com.cmepps.listatareas.NoHexagonal.service.AsignaturaService;

@Controller
public class AsignaturaController {
	@Autowired
    private AsignaturaService asigService;

	@RequestMapping(value = "/formulario-asignatura", method = RequestMethod.POST)
    public String mostrarFormularioAsignatura() {
        return "formulario-asignatura";
    }

	@RequestMapping(value = "/agregar-asignatura", method = RequestMethod.POST)
    public String agregarAsignatura(@RequestParam("nombre") String nombre, ModelMap model) {
        if (asigService.agregarAsignatura(nombre)) {
            return "exito"; // Página de éxito
        } else {
            model.addAttribute("error", "La asignatura ya existe");
            return "formulario-asignatura"; // Volver a escribir el nombre de la asignatra con mensaje de error
        }
    }
}
