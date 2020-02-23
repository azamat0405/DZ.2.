package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(wind(35 ,50 ));

    }

    public static String wind(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "можно ++прогуляться";

        } else if (age > 20 && temp > 0 && temp > 30) {
            return "можно прогуляться";

        } else if (age < 45 && temp < -10 && temp < 25) {
            return "можно прогуляться";

        } else {
            return "Оставайтесь дома";
        }


    }

    public static int generateRandomAge() {
        Random rand = new Random();
        int rand_1i = rand.nextInt(60) + 1;
        return rand_1i;
    }
}


