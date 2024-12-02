package com.sarigonz.springboot.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sarigonz.springboot.dao.SuperheroDaoService;
import com.sarigonz.springboot.model.Superhero;

// @RestController(value = "/superhero")
@RestController
public class SuperheroController {

    @Autowired
    private SuperheroDaoService superheroDaoService;

    @GetMapping("/superhero")
    public List<Superhero> findAllSuperheroes() {
        return superheroDaoService.findAllSuperheroes();
        
    }

    @GetMapping("/superhero/{id}")
    public Superhero findSuperheroById(@PathVariable int id) {
        return superheroDaoService.findSuperheroById(id);

    }

    @PostMapping("/superhero")
    // public Superhero addNewSuperhero(@RequestBody Superhero superhero) {
    public ResponseEntity<Object> addNewSuperhero(@RequestBody Superhero superhero) {
        Superhero newSuperhero = superheroDaoService.addNewSuperhero(superhero);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newSuperhero.getId()).toUri(); //create location from current request, add path id and convert to URI
        return ResponseEntity.created(location).build();
        
    }

}
