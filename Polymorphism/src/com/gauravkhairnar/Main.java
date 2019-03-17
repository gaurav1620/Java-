package com.gauravkhairnar;

public class Main {

    public static void main(String[] args) {
         for (int i = 0;i < 10; i++) {
            Movie aMovie = randomMovie();
             System.out.println("Name :"+aMovie.getName());
             System.out.println("Plot :"+aMovie.plot()+"\n");
        }
    }

    public static Movie randomMovie() {
        int random = (int) (Math.random() * 5 + 1); //math random gives a float random between 1 and 5
        System.out.println("The random Number Generated is " + random);
        switch (random) {
            case 1:
                return new FightClub();
            case 2:
                return new Se7en();
            case 3:
                return new Avatar();
            case 4:
                return new Arrival();
            case 5:
                return new SilenceOfTheLambs();
        }
        return null;
    }
}

