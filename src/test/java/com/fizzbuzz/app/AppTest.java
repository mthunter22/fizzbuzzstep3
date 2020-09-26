package com.fizzbuzz.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest
{
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Before
    public void init() {
        int[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        fizzBuzz.transpose(input);
    }

    @Test
    public void fizzPrintTest() {
        int input = 6;
        assertEquals("fizz", fizzBuzz.fizzPrint(input));
    }

    @Test
    public void buzzPrintTest() {
        int input = 5;
        assertEquals("buzz", fizzBuzz.buzzPrint(input));
    }

    @Test
    public void fizzBuzzPrintTest() {
        int input = 15;
        assertEquals("fizzbuzz", fizzBuzz.fizzBuzzPrint(input));
    }

    @Test
    public void integerTest() {
        int input = 17;
        assertEquals("17", fizzBuzz.integerPrint(input));
    }

    @Test
    public void transposeOutputTest() {
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz \n" +
                "fizz: 4\n" +
                "buzz: 3\n" +
                "fizzbuzz: 1\n" +
                "lucky: 2\n" +
                "integer: 10", fizzBuzz.transposeOutput());
    }

    @Test
    public void luckyPrintTest() {
        int input = 13;
        assertEquals("lucky", fizzBuzz.luckyPrint(input));
    }

    @Test
    public void getFizzCountTest() {
        assertEquals(4, fizzBuzz.getFizzCount());
    }

    @Test
    public void getBuzzCountTest() {
        assertEquals(3, fizzBuzz.getBuzzCount());
    }

    @Test
    public void getFizzBuzzCountTest() {
        assertEquals(1, fizzBuzz.getFizzBuzzCount());
    }

    @Test
    public void getIntegerTest() {
        assertEquals(10, fizzBuzz.getIntegerCount());
    }
}
