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
            System.out.print("\tIntroduceti o optiune: ");

            Scanner scanner = new Scanner(System.in);
            int option = Integer.parseInt(scanner.nextLine());

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
            }
            //scanner.close();
        }



    }

    private static void trianglePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntroduceti dimensiunile laturilor");
        System.out.print("Latura 1: ");
        int l1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Latura 2: ");
        int l2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Latura 3: ");
        int l3 = Integer.parseInt(scanner.nextLine());

        Perimeter triangle = new Triangle(l1,l2,l3);
        System.out.println("\nPerimetrul triunghiului este: " + triangle.perimeter());
        //scanner.close();
    }

    private static void squarePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti dimensiunea unei laturi: ");
        int l = Integer.parseInt(scanner.nextLine());

        Perimeter square = new Square(l);
        System.out.println("\nPerimetrul dreptunghiului este: " + square.perimeter());
        //scanner.close();
    }

    private static void circlePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti raza cercului: ");
        int r = Integer.parseInt(scanner.nextLine());

        Perimeter circle = new Circle(r);
        System.out.println("\nPerimetrul (lungimea) cercului este: " + circle.perimeter());
    }
}