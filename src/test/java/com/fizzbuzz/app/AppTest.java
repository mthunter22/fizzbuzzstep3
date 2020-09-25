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
        int[] multipleOfThreeWithoutThree = {18};
        int[] rangeOfTwenty = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        assertEquals("1 \n" +
                "fizz: 0\n" +
                "buzz: 0\n" +
                "fizzbuzz: 0\n" +
                "lucky: 0\n" +
                "integer: 1", fizzBuzz.transpose(oneInput));
        assertEquals("lucky \n" +
                "fizz: 0\n" +
                "buzz: 0\n" +
                "fizzbuzz: 0\n" +
                "lucky: 1\n" +
                "integer: 0", fizzBuzz.transpose(threeInput));
        assertEquals("buzz \n" +
                "fizz: 0\n" +
                "buzz: 1\n" +
                "fizzbuzz: 0\n" +
                "lucky: 0\n" +
                "integer: 0", fizzBuzz.transpose(fiveInput));
        assertEquals("fizzbuzz \n" +
                "fizz: 0\n" +
                "buzz: 0\n" +
                "fizzbuzz: 1\n" +
                "lucky: 0\n" +
                "integer: 0", fizzBuzz.transpose(fifteenInput));
        assertEquals("fizz \n" +
                "fizz: 1\n" +
                "buzz: 0\n" +
                "fizzbuzz: 0\n" +
                "lucky: 0\n" +
                "integer: 0", fizzBuzz.transpose(multipleOfThreeWithoutThree));
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz \n" +
                "fizz: 4\n" +
                "buzz: 3\n" +
                "fizzbuzz: 1\n" +
                "lucky: 2\n" +
                "integer: 10", fizzBuzz.transpose(rangeOfTwenty));
    }
}
