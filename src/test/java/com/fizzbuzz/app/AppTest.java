package com.fizzbuzz.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest
{
    @Test
    public void fizzBuzzOutputTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int[] oneInput = {1};
        int[] threeInput = {3};
        int[] fiveInput = {5};
        int[] fifteenInput = {15};
        int[] rangeOfTwenty = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        assertEquals("1 ", fizzBuzz.transpose(oneInput));
        assertEquals("fizz ", fizzBuzz.transpose(threeInput));
        assertEquals("buzz ", fizzBuzz.transpose(fiveInput));
        assertEquals("fizzbuzz ", fizzBuzz.transpose(fifteenInput));
        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz ", fizzBuzz.transpose(rangeOfTwenty));
    }
}