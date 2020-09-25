package com.fizzbuzz.app;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz
{
    public static void main( String[] args )
    {
        
    }
    public static String transpose(int[] rangeOfNumbers) {
        String fizz = "fizz";
        String buzz = "buzz";
        String fizzbuzz = "fizzbuzz";
        String result = "";
        for(int number : rangeOfNumbers) {
            if (number % 15 == 0) {
                System.out.print(fizzbuzz + " ");
                result = fizzbuzz;
            }
            else if (number % 3 == 0) {
                System.out.print(fizz + " ");
                result = fizz;
            }
            else if (number % 5 == 0) {
                System.out.print(buzz + " ");
                result = buzz;
            }
            else {
                System.out.print(number + " ");
                result = Integer.toString(number);
            }
        }
        return result;
    }
}
