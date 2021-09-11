package com.sofkau.crudPersona.controlador;

import com.sofkau.crudPersona.entidades.Persona;
import com.sofkau.crudPersona.servicios.InterfaceServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    private InterfaceServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona> listarPersonas(){
        return servicio.listar();
    }

    @GetMapping(value = "/listarPersona/{id}")
    public Persona listarPersona(@PathVariable("id") int id){
        return servicio.listarId(id);
    }

    @PostMapping(value = "/guardarPersona")
    public Persona guardarPersona(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }

    @PutMapping(value = "/actualizarPersona")
    public Persona actualizarPersona(@RequestBody Persona persona){
        return servicio.actualizar(persona);
    }

    @DeleteMapping("borrarPersona/{id}")
    public void borrarPersona(@PathVariable("id") int id){
        servicio.borrar(id);
    }
}
