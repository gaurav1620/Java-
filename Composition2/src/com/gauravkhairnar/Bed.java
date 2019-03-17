package com.gauravkhairnar;

public class Bed {

    private int size;
    private int height;
    private String material;
    private Coution theCoution;

    public Bed(int size, int height, String material, Coution theCoution) {
        this.size = size;
        this.height = height;
        this.material = material;
        this.theCoution = theCoution;
    }

    public void showBedInfo(){
        showBedSize();
        theCoution.showFluffyness();
    }
    public void showBedSize(){
        System.out.println("The Size of the bed is " +this.getSize());
    }

    public int getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public Coution getTheCoution() {
        return theCoution;
    }
}
