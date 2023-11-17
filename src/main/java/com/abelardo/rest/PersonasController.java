package com.abelardo.rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Api/v1/Personas")
public class PersonasController {
    List<Persona> personas;

    public PersonasController(){
        this.personas=new ArrayList<>();
    }


    @PostMapping()
    public Persona crearPersona(@RequestBody() Persona persona){
        this.personas.add(persona);
        return persona;

    }
    @GetMapping()
    public List<Persona> listarPersonas(){
        return this.personas;
    }

    @GetMapping("/{id}")
    public Persona getPersonaPorId(@PathVariable("id") String id){
        Optional<Persona> optionalPersona =this.personas.stream().filter(p -> p.getCedula().equals(id) ).findFirst();
        if (optionalPersona.isEmpty()){
            return new Persona();
        }
        return optionalPersona.get();

    }
}
