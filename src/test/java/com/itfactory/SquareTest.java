package com.itfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    Perimeter square;

    @Test
    public void perimeterTest() {
        square = new Square(9);
        double perimeter = square.perimeter();
        assertEquals(36, perimeter,0.00001);
    }
}
