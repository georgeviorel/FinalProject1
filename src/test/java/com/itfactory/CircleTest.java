package com.itfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    Perimeter circle;

    @Test
    public void perimeterTest() {
        circle = new Circle(3);
        double perimeter = circle.perimeter();
        assertEquals(18.8495,perimeter,0.0001);
    }
}
