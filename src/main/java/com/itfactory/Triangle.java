package com.itfactory;

public class Triangle implements Perimeter{
    private double l1;
    private double l2;
    private double l3;

    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double perimeter() {
        //System.out.println("\nPerimetrul triunghiului este: " + (l1+l2+l3));
        return l1+l2+l3;
    }
}
