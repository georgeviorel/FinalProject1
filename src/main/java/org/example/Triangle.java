package org.example;

public class Triangle implements Perimeter{
    private int l1;
    private int l2;
    private int l3;

    public Triangle(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public void perimeter() {
        System.out.println("\nPerimetrul triunghiului este: " + (l1+l2+l3));
    }
}
