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
        String space = " ";
        for(int number : rangeOfNumbers) {
            if (number % 15 == 0) {
                System.out.print(fizzbuzz + " ");
                result += fizzbuzz + space;
            }
            else if (number % 3 == 0) {
                System.out.print(fizz + " ");
                result += fizz + space;
            }
            else if (number % 5 == 0) {
                System.out.print(buzz + " ");
                result += buzz + space;
            }
            else {
                System.out.print(number + " ");
                result += Integer.toString(number) + space;
            }
        }
        return result;
    }
}

