package com.ironhack.helloworld.main;

import com.ironhack.helloworld.classes.*;
import com.ironhack.helloworld.interfaces.CloudFeatures;
import com.ironhack.helloworld.interfaces.Playable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World :D");

        double revenueTask = 0.6;
        double serviceFee = 0.1;

        double result2 = revenueTask + serviceFee;

        System.out.println(result2);

        System.out.println(revenueTask + serviceFee);

//        BigDecimal bigDecimalRevenueTask = new BigDecimal("0.755");
//        BigDecimal bigDecimalServiceFee = new BigDecimal("0.133");
//        BigDecimal result = bigDecimalRevenueTask.add(bigDecimalServiceFee).setScale(2, RoundingMode.HALF_EVEN);

        BigDecimal ten = new BigDecimal("10");
        BigDecimal three = new BigDecimal("3");
        BigDecimal result = ten.divide(three, 2, RoundingMode.HALF_UP);
        System.out.println(result);

//        interfacesAndAbstractClasses();
//        scannerAndFileHandling();
//        firstLessons();
    }

    public static void interfacesAndAbstractClasses() {
        Employee employee = new Employee("Carmen", "carmen@supercarmen.com", 16);
        employee = new Employee();
        System.out.println(Calculator.add(4, 6));
//        employee.setName("Laura");
        Boss boss = new Boss("Mariela", "marual@amil.sdasd", 20, 30000, 15000);
        System.out.println(boss.getSalaryPlus());
        System.out.println(employee.getType());

        Playable androidPlayer = new AndroidPlayer(0);
        Playable applePlayer = new ApplePlayer(0);
        androidPlayer.play();
        applePlayer.play();

//        Playable playable = new Playable();

        List<String> names = new Stack<>();

        names.add("Sofia");
        names.get(0);

        Shape triangle = new Triangle(10, 5);
        Shape circle = new Circle(10);

        System.out.println(triangle.calculateArea());
        System.out.println(circle.calculateArea());

//        Shape shape = new Shape(10, 5);
    }

    public static void scannerAndFileHandling() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please introduce your name");
        String name = scanner.nextLine();

        System.out.println("Please introduce your age");
        int age = scanner.nextInt();

        while(age < 0) {
            System.out.println("Please introduce a valid age");
            age = scanner.nextInt();
        }

        System.out.println("Your name is " + name + " and you age is " + age);
        scanner.close();

        FileWriter fileWriter = new FileWriter("demo.txt", true);

        fileWriter.write("Hello this is a line\n");
        fileWriter.write("This another line");
        fileWriter.close();

        File file = new File("demo.txt");
        scanner = new Scanner(file);
        while(scanner.hasNext()) {
            String line = scanner.nextLine();

            System.out.println(line);
        }

        scanner.close();
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
