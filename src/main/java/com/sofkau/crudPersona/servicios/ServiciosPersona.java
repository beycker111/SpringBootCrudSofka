package com.sofkau.crudPersona.servicios;

import com.sofkau.crudPersona.entidades.Persona;
import com.sofkau.crudPersona.repositorio.InterfaceRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiciosPersona implements InterfaceServiciosPersona {

    @Autowired
    private InterfaceRepositorioPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return null;
    }

    @Override
    public Persona guardar(Persona persona) {
        return null;
    }

    @Override
    public void borrar(int id) {

    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }
}
