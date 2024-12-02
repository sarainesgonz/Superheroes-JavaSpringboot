package com.sarigonz.springboot.model;
import java.util.Date;

public class Superhero {

    private int id;
    private String realName;
    private String superheroName;
    private Date birthdate;
    
    public Superhero() {
    }

    public Superhero(int id, String realName, String superheroName, Date birthdate) {
        this.id = id;
        this.realName = realName;
        this.superheroName = superheroName;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    } 

}
