package com.consultadd.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bday {

    @Id
    private String id;
    private String name;
    private int age;
    private String dob;

    public Bday() {
    }

    public Bday(String id, String name, String dob)
    {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setAge(String dob) {
        this.dob = dob;
    }
}
