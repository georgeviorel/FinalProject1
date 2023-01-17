package com.itfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    Perimeter triangle;

    @Test
    public void perimeterTest() {
        triangle = new Triangle(4,5,6);
        double perimeter = triangle.perimeter();
        assertEquals(15,perimeter,0.00001);
    }
}
