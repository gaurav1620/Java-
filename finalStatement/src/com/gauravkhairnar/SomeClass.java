package com.gauravkhairnar;

public class SomeClass {
    private final int var0 = 1;      //private
    public final int var1;           //public
    private String name;             //private
    private static int counter = 0;  //Static private (Static means it is a variable that will be same for all classes of Someclass type)

//    public void SomeClass(){
//        var0 = 1;         //as you can see a private final cannot be changed
//    }


    public SomeClass(String name) {
        this.name = name;
        counter++;
        var1 = counter;
        System.out.println(name+" created with var1 = " +var1);
    }

    public String getName() {
        return name;
    }

    public int getVar1() {
        return var1;
    }

}




