package com.sarigonz.springboot.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sarigonz.springboot.model.Superhero;

@Service
public class SuperheroDaoService {
// simulación de BD
    private static List<Superhero> superheroes = new ArrayList<>( Arrays.asList(
        new Superhero(1, "Bruce Wayne", "Batman", new Date()),
        new Superhero(2, "Bruce Banner", "Hulk", new Date()),
        new Superhero(3, "Peter Parker", "Spiderman", new Date()),
        new Superhero(4, "Logan Howlett", "Wolverine", new Date()),
        new Superhero(5, "Clark Kent", "Superman", new Date())
    ));



    private static int counter = 5;

// metodos
// Get all superheroes
    public List<Superhero> findAllSuperheroes() {
        return superheroes;
    }

// Get 1 specific superhero
    public Superhero findSuperheroById(int id ) {
        Superhero result = null;

        for (Superhero superhero : superheroes) {
            if (superhero.getId() == id) {
                result = superhero;
            }
        }
        return result;
    }

// Add a new superhero
    public Superhero addNewSuperhero(Superhero superhero) {
        superhero.setId(++counter);
        superheroes.add(superhero);
        return superhero;
    }

// Delete a superhero
    public boolean deleteSuperhero(int id) {
        Iterator<Superhero> superheroIterator = superheroes.iterator();
        Superhero superheroToRemove = null;

        do {
            superheroToRemove = superheroIterator.next();
            if (superheroToRemove.getId() == id) {
                superheroIterator.remove();
                return true;
            }
        } while (superheroIterator.hasNext());

        return false;
    }

}
