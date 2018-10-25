package com.example.demo.model;

import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = -3626584927076403009L;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
