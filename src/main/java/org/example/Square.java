package org.example;

public class Square implements Perimeter{
    private int l;

    public Square(int l) {
        this.l = l;
    }

    @Override
    public void perimeter() {
        System.out.println("\nPerimetrul dreptunghiului este: " + (l*4));
    }
}
