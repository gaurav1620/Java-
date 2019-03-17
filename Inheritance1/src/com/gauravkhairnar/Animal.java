package com.gauravkhairnar;

import java.security.PrivateKey;

public class Animal {
    private String name;
    private int brain;
    private int legs;
    private int body;
    private int size;

    public Animal(String name, int brain, int legs, int body, int size) {
        this.name = name;
        this.brain = brain;
        this.legs = legs;
        this.body = body;
        this.size = size;
    }

    public void eat(){
        System.out.println("Animal Eat called!!");
    }
    public void move(){

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getLegs() {
        return legs;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }
}
