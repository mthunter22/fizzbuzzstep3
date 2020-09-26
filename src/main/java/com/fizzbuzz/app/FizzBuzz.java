package com.fizzbuzz.app;

public class FizzBuzz
{
    public static void main (String[] args) {
        //e.g. transpose range of number 1-20 via fizzbuzz
        int[] sampleRange = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(transpose(sampleRange));
    }

    public static String transpose(int[] rangeOfNumbers) {
        String output = "";
        for(int number : rangeOfNumbers) {
            output = output + fizzBuzzPrint(number);
            output = output + fizzPrint(number);
            output = output + buzzPrint(number);
            output = output + integerPrint(number);
            output = output + " ";
        }
        return output;
    }

    public static String fizzPrint(int number) {
        String fizz = "";
        if (number % 3 == 0 && number % 15 != 0) {
            fizz = "fizz";
        }
        return fizz;
    }

    public static String buzzPrint(int number) {
        String buzz = "";
        if (number % 5 == 0 && number % 15 != 0) {
            buzz = "buzz";
        }
        return buzz;
    }

    public static String fizzBuzzPrint(int number) {
        String fizzBuzz = "";
        if (number % 15 == 0) {
            fizzBuzz = "fizzbuzz";
        }
        return fizzBuzz;
    }

    public static String integerPrint(int number) {
        String integer = "";
        if (number % 15 != 0 && number % 5 != 0 && number % 3 != 0) {
            integer = Integer.toString(number);
        }
        return integer;
    }
}

