package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
	    String mystring = "This is a Basic String";
	    String string2 = mystring + ",and this is added to it !";
        System.out.println(string2);
        string2 = string2 + "\u00A9 2019.";  // \U00A9 IS A UNICODE CHARACTER WE CAN FIND THESE CODES ONLINE ON UNICODE TABLES
        System.out.println(string2);

        int i = 5;
        System.out.println("\nThis is a i++  test " + i++);
        System.out.println("This is a test after i++ == " + i);
        System.out.println("The valuse of  i is " + i +" right now");
        System.out.println("The Value for ++i right in this statement is " + (++i));


        boolean hasCar = true;
        if(hasCar == !false)
            System.out.println("\nHe has a car!!\n");
        else
            System.out.println("He does not have a car\n");

        boolean hasCat = false;
        boolean doesnthavacat = hasCat ? false : true;
        if (doesnthavacat == true)
            System.out.println("He Does Not Have A Cat");
        else if(doesnthavacat == false)
            System.out.println("He has a Cat!!");

        int input,first,second,third;
        input = 69;   //Points
        first = 100;
        second = 60;
        third = 40;

        if(input >= first)
            System.out.println("COngrats You Have Secured First Place :) ");
        else if(input >= second && input < first)
            System.out.println("You Have Secured Second Place");
        else if(input >= third && input < second)
            System.out.println("You Have Secured Third Place");
        else
            System.out.println("Sorry you have not secures any rank ;(");
    }
}
