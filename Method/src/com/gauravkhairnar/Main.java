package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        int score1 = 800;
        int level1 = 6;
        int bonus1 = 100;
        int the_score = calculate_score(score1,level1,bonus1);
        System.out.println("YOur score is " + the_score + "\n");

        int myscore = 149;
        rank(myscore);
    }


    //The following is a Method ; its same as a function in c/c++/c#
    public static int calculate_score(int score,int level,int bonus){
        int final_score = score + (level*bonus);
        return final_score;
    }

    public static void rank(int score){
        if (score > 100)
            System.out.printf("Enter a valid score @_@\n");
        else if (score <= 100 && score > 70)
            System.out.println("Congrats you have got a A Grade !! :)\n");
        else if (score <= 70 && score > 55)
            System.out.println("Congrats you have got a B Grade !! :)\n");
        else if (score <= 55 && score > 40)
            System.out.println("Congrats you have got a C Grade !! :)\n");
        else
            System.out.println("You have Failed !! :(\n");

    }
}
