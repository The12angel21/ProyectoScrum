package com.cmepps.listatareas.infraestructure.ui_driver_adapter_rest.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cmepps.listatareas.domain.model.Asignatura;
import com.cmepps.listatareas.domain.port.driver_port.AsignaturaService;
import com.cmepps.listatareas.infraestructure.driven_adapter.entity.AsignaturaEntity;



@Controller
public class AsignaturaController {
	@Autowired
    private AsignaturaService asigService;

	@RequestMapping(value = "/formulario-asignatura", method = RequestMethod.GET)
    public String mostrarFormularioAsignatura(Model model) {
		List<AsignaturaEntity> asignaturas = asigService.obtenerTodasLasAsignaturas();
       model.addAttribute("asignaturas", asignaturas);
        return "formulario-asignatura";
    }

	@RequestMapping(value = "/agregar-asignatura", method = RequestMethod.GET)
    public String agregarAsignatura(@RequestParam("nombre") String nombre, ModelMap model) {
        if (asigService.agregarAsignatura(nombre)) {
            return "exito"; // Página de éxito
        } else {
            model.addAttribute("error", "La asignatura ya existe");
            return "formulario-asignatura"; // Volver a escribir el nombre de la asignatra con mensaje de error
        }
    }
}
