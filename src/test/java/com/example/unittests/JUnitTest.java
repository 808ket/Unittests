package com.example.unittests;

import com.example.unittests.HelloApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTest {

    private final Fees fees = new Fees();

    @Test
    void testFees10 () {
        assertEquals(48.50, fees.estimateFee(1));
        assertEquals(48.50, fees.estimateFee(10));
    }

    @Test
    void testFees15 () {
        assertEquals(68.50, fees.estimateFee(11));
        assertEquals(68.50, fees.estimateFee(15));
    }

    @Test
    void testFees20 () {
        assertEquals(88.50, fees.estimateFee(16));
        assertEquals(88.50, fees.estimateFee(20));
    }

    @Test
    void testFees25 () {
        assertEquals(128.50, fees.estimateFee(21));
        assertEquals(128.50, fees.estimateFee(25));
    }

    @Test
    void testFees30 () {
        assertEquals(178.50, fees.estimateFee(26));
        assertEquals(178.50, fees.estimateFee(30));
    }

    @Test
    void testFees40 () {
        assertEquals(228.50, fees.estimateFee(31));
        assertEquals(228.50, fees.estimateFee(40));
    }

    @Test
    void testFees50 () {
        assertEquals(348.50, fees.estimateFee(41));
        assertEquals(348.50, fees.estimateFee(50));
    }

    @Test
    void testFees60 () {
        assertEquals(508.50, fees.estimateFee(51));
        assertEquals(508.50, fees.estimateFee(60));
    }

    @Test
    void testFees70 () {
        assertEquals(633.50, fees.estimateFee(61));
        assertEquals(633.50, fees.estimateFee(70));
    }

    @Test
    void testFeesAbove70 () {
        assertEquals(738.50, fees.estimateFee(71));
    }

    @Test
    void testFeesNegativ () {
        assertEquals(0, fees.estimateFee(-1));
    }

    @Test
    void testFeesNull () {
        assertEquals(0, fees.estimateFee(0));
    }
}
