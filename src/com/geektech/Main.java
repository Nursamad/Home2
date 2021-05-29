package com.geektech;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = generateRandomAge();
        int temp = 20;
        System.out.println(generateRandomAge());
        if (age > 20 && age < 45 && temp < 30 && temp > -20){
            System.out.println("Можно идти гулять! " + name);
        } else if (age < 20 && temp > 0 && temp < 28){
            System.out.println("Можно гулять! " + name);
        } else if (age > 45 && temp > -10 && temp < 25){
            System.out.println("Можно гулять! " + name);
        } else {
            System.out.println("Оставайтесь дома!" + name);
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();

        int age = random.nextInt(107);

        return age;


    }
    }




