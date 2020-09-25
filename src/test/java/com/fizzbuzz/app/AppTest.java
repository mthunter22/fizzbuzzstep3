package com.fizzbuzz.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest 
{
    @Test
    public void fizzBuzzOutputTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int[] oneInput = {1};
        int[] threeInput = {3};
        int[] fiveInput = {5};
        int[] fifteenInput = {15};
        assertEquals("1", fizzBuzz.transpose(oneInput));
        assertEquals("fizz", fizzBuzz.transpose(threeInput));
        assertEquals("buzz", fizzBuzz.transpose(fiveInput));
        assertEquals("fizzbuzz", fizzBuzz.transpose(fifteenInput));
    }
}
