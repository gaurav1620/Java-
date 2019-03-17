package com.gauravkhairnar;

public class Dog extends Animal {

    private int teeth;
    private String coat;

    public Dog(String name, int brain, int legs, int body, int size, int teeth, String coat) {
        super(name, brain, legs, body, size);
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Chew from dog class called");
    }

    @Override
    public void eat() {
        System.out.println("override eat from dog class called");
        chew();
        super.eat();
    }
}

