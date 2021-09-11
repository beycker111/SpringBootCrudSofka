package com.sofkau.crudPersona.controlador;

import com.sofkau.crudPersona.entidades.Persona;
import com.sofkau.crudPersona.servicios.InterfaceServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    private InterfaceServiciosPersona servicio;

    @GetMapping(value = "listarPersonas")
    public Iterable<Persona> listarPersonas(){
        return servicio.listar();
    }
}
