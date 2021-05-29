package com.geektech;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String name = "Nursamad"; //string это переменная
        int age = generateRandomAge();
        int temp = 20;
        System.out.println(generateRandomAge());
        if (age > 20 && age < 45 && temp < 30 && temp > -20){
            System.out.println("Можно идти гулять!");
        } else if (age < 20 && temp > 0 && temp < 28){
            System.out.println("Можно гулять!");
        } else if (age > 45 && temp > -10 && temp < 25){
            System.out.println("Можно гулять!");
        } else {
            System.out.println("Оставайтесь дома!");
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();

        int age = random.nextInt(107);

        return age;
    }


}

