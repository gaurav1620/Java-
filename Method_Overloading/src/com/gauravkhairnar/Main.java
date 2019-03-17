package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
        calculate_score("Gaurav",100);
        calculate_score("Gaurav");
        calculate_score(100);
        calculate_score();
    }

    public static void calculate_score(String s,int i){
        i = i*100;
        System.out.println(s + " player scored " + i);
    }

    public static void calculate_score(String s){

        System.out.println(s + " player scored unknown score .");
    }

    public static void calculate_score(int i){
        i = i*100;
        System.out.println("Unknown  player scored " + i);
    }

    public static void calculate_score(){

        System.out.println("Unknown player scored unknown score");
    }
}
