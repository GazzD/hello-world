package com.ironhack.helloworld.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("probando github World :D");

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please introduce your name");
//        String name = scanner.nextLine();
//
//        System.out.println("Please introduce your age");
//        int age = scanner.nextInt();
//
//        while(age < 0) {
//            System.out.println("Please introduce a valid age");
//            age = scanner.nextInt();
//        }
//
//        System.out.println("Your name is " + name + " and you age is " + age);
//        scanner.close();

//        FileWriter fileWriter = new FileWriter("demo.txt", true);
//
//        fileWriter.write("Hello this is a line\n");
//        fileWriter.write("This another line\n");
//        fileWriter.close();

        File file = new File("demo.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            String line = scanner.nextLine();

            System.out.println(line);
        }

        scanner.close();
//        firstLessons();
    }

    private static void firstLessons() {
        // String int double boolean char Integer float byte Date long short
//
//        Primitivos
//        int double boolean char float byte long short
        int x = 1;


        // Wrappers
        // Integer, Double, Long, Boolean
        Integer y = 10;

        double aux = 1.1;

        float f = 1.2f;

        // Classes
        // String, Date, Calendar, Math

        // + - * / %

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(Math.sqrt(9));


        if(x > 10) {
            System.out.println("Mayor a 10");
        } else if(x == 10) {
            System.out.println("Igual a 10");
        } else {
            System.out.println("Menor a 10");
        }


        int day = 7;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        // <condición> ? <expr1> : <expr2>;

        int a = 1;
        a = 4 + 5;

        String result = day > 0 && day < 6 ? "Weekday" : "Weekend";


//        System.out.println(result);

//        System.out.println(returnStuff(day));

        String message = "Hello";

        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.toUpperCase().charAt(1));

        System.out.println(message.lastIndexOf('e'));

        String productName = "    this is an awesome product   ";
        String publishDate = "   31 de mayo del 2022  ";
        String productFormatted = productFormatter(productName, publishDate);

        System.out.println(productFormatted);

        String[] names = { "Alba", "Rocío", "Vedrana", "Blanca" };

        System.out.println("=== FOR ===");
        for(int i=0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("=== WHILE ===");
        int i=0;
        while(i<names.length) {
            System.out.println(names[i++]);
        }

        System.out.println("=== DO WHILE ===");
        i=0;
        do {
            System.out.println(names[i++]);
        }while(i<names.length);


        System.out.println("=== FOREACH ===");
        for(String name : names) {
            System.out.println(name);
        }

        System.out.println("=== STREAM ===");
//        Arrays.stream(names).forEach(System.out::println);
        Arrays.stream(names).forEach(name -> System.out.println(name));

        int[] input = {1, 2,3, 4, 5,6};
        int[] response = findSmallest(input);

        System.out.println(response[0]);
        System.out.println(response[1]);
    }

    private static String productFormatter(String productName, String publishDate) {
        return productName.trim()
                .concat(" ")
                .concat(publishDate.trim())
                .replace(" ", "_")
                .toUpperCase();

    }

    private static String returnStuff(int day) {
        String result = "";
        if(day >= 1 && day <=5) {
            return "Weekday";
        }
        return "Weekend";
    }

    public static int[] findSmallest(int[] numberList) {

        int smallest = 1;
        int secondSmallest = 2;

        int[] result = new int[2];

        result[0] = smallest;
        result[1] = secondSmallest;

        return result;

    }



}
