package com.itfactory;

public class Circle implements Perimeter{
    private int r;
    private final double PI = 3.141592653589;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        //System.out.println("\nPerimetrul (lungimea) cercului este: " + (2*PI*r));
        return 2*PI*r;
    }
}
