package com.ceiba.primeraweb;

import com.ceiba.primeraweb.entities.Persona;
import com.ceiba.primeraweb.repository.PersonaRepository;
import com.ceiba.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSprintbootApplication {

	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSprintbootApplication.class, args);

	}
	/*
	@Override
	public void run(String... args) throws Exception {

		personaService.crearPersona(new Persona(5L,"Jorge",17));
		personaService.crearPersona(new Persona(6L,"Alberto",18));
		personaService.crearPersona(new Persona(7L,"Juan",19));
		personaService.crearPersona(new Persona(8L,"Sebastian",20));

		//Mostramos el numero de personas
		System.out.println("Numero de personas de la tabla: "+personaService.contarPersonas());

		//Mostramos la lista de personas
		List<Persona> personas = personaService.obtenerTodas();
		personas.forEach(p -> System.out.println("Nombre de la Persona: "+ p.getNombre()));

	}
	 */
}
