package com.itfactory;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("""
            \n\n\tCalcul perimetru - meniu principal:
                \t1 - Triunghi
                \t2 - Patrat
                \t3 - Cerc
                \t0 - Iesire din program""");
            System.out.print("\n\tIntroduceti o optiune: ");

            Scanner scanner = new Scanner(System.in);
            String tempOption = scanner.nextLine();
            int option;
            if (isInteger(tempOption)) {
                option = Integer.parseInt(tempOption);
            } else {
                option = -1;
            }

            switch (option) {
                case 1:
                    trianglePerimeter();
                    break;
                case 2:
                    squarePerimeter();
                    break;
                case 3:
                    circlePerimeter();
                    break;
                case 0:
                    System.out.println("\nLa revedere!");
                    System.exit(0);
                default:
                    System.out.println("\nOptiune invalida!");
            }
            //scanner.close();
        }



    }


    private static boolean isInteger(String string) {
        if (string == null) {
            return false;
        }
        try{
            Integer.parseInt(string);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }


    private static boolean isDouble(String string) {
        if (string == null) {
            return false;
        }
        try{
            Double.parseDouble(string);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }


    private static void trianglePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntroduceti dimensiunile laturilor");
        String tempString;

        System.out.print("Latura 1: ");
        tempString = scanner.nextLine();
        double l1 = 0;
        if (isDouble(tempString)) {
            l1 = Integer.parseInt(tempString);
        } else {
            System.out.println("\nDate invalide. Reintroduceti!");
            return;
        }

        System.out.print("Latura 2: ");
        tempString = scanner.nextLine();
        double l2 = 0;
        if (isDouble(tempString)) {
            l2 = Integer.parseInt(tempString);
        } else {
            System.out.println("\nDate invalide. Reintroduceti!");
            return;
        }

        System.out.print("Latura 3: ");
        tempString = scanner.nextLine();
        double l3 = 0;
        if (isDouble(tempString)) {
            l3 = Integer.parseInt(tempString);
        } else {
            System.out.println("\nDate invalide. Reintroduceti!");
            return;
        }

        Perimeter triangle = new Triangle(l1,l2,l3);
        System.out.println("\nPerimetrul triunghiului este: " + triangle.perimeter());
        //scanner.close();
    }


    private static void squarePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti dimensiunea unei laturi: ");
        String tempString = scanner.nextLine();
        double l = 0;
        if (isDouble(tempString)) {
            l = Integer.parseInt(tempString);
        } else {
            System.out.println("\nDate invalide. Reintroduceti!");
            return;
        }
        Perimeter square = new Square(l);
        System.out.println("\nPerimetrul dreptunghiului este: " + square.perimeter());
        //scanner.close();
    }


    private static void circlePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti raza cercului: ");
        String tempString = scanner.nextLine();
        double r = 0;
        if (isDouble(tempString)) {
            r = Double.parseDouble(tempString);
        } else {
            System.out.println("\nDate invalide. Reintroduceti!");
            return;
        }
        Perimeter circle = new Circle(r);
        System.out.println("\nPerimetrul (lungimea) cercului este: " + circle.perimeter());
    }
}