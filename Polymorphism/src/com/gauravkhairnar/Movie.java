package com.gauravkhairnar;

public class Movie {
    private  String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "Default movie class";
    }

    public String getName() {
        return name;
    }
}
