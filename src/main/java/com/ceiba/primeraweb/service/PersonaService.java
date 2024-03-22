package com.ceiba.primeraweb.service;

import com.ceiba.primeraweb.entities.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> obtenerTodas();

    Persona obtenerPorId(Long id);

    Persona crearPersona(Persona persona);

    Persona actualizarPersona(Long id, Persona persona);

    void eliminarPersona(Long id);

    long contarPersonas();


}
