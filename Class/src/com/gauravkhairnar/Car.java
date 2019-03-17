package com.gauravkhairnar;

public class Car {
    private int doors;
    private int wheels;
    public String  model;
    private  String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();

        //WE ARE RESTRICTING INPUT TO TWO MODELS ONLY
        if ((validModel.equals("carrera")) || (validModel.equals("aventador"))){
            this.model = validModel;
        }
        else
            this.model = "Unknown";
    }
    public String getModel(){
        return this.model;
    }

}
