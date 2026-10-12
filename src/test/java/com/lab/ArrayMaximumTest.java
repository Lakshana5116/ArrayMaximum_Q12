package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayMaximumTest {

    @Test
    void testMaximumPositiveNumbers() {
        ArrayMaximum obj = new ArrayMaximum();
        assertEquals(50, obj.findMaximum(new int[]{10, 50, 30, 20}));
    }

    @Test
    void testMaximumNegativeNumbers() {
        ArrayMaximum obj = new ArrayMaximum();
        assertEquals(-2, obj.findMaximum(new int[]{-5, -2, -8}));
    }
}