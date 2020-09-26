package com.fizzbuzz.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest
{
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzPrintTest() {
        int input = 3;
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
    public void transposeTest() {
        int[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz ", fizzBuzz.transpose(input));
    }
}
