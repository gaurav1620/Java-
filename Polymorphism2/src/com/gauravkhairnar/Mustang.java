package com.gauravkhairnar;

public class Mustang extends Car {
    public Mustang(String name, int speed) {
        super(name, 8, speed);
    }

    @Override
    public void startEngine() {
        System.out.println("The Mustang's engine has started");
    }

    @Override
    public void brakes(int b) {
        super.brakes(b);
    }

    @Override
    public void accelerate(int a) {
        super.accelerate(a);
    }
}
