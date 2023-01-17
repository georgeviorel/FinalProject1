package com.itfactory;

public class Square implements Perimeter{
    private double l;

    public Square(double l) {
        this.l = l;
    }

    @Override
    public double perimeter() {
        //System.out.println("\nPerimetrul dreptunghiului este: " + (l*4));
        return l*4;
    }
}
