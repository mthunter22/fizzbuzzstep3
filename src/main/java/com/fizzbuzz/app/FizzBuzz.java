package com.fizzbuzz.app;

public class FizzBuzz
{
    public static void main( String[] args ) { }

    public static String transpose(int[] rangeOfNumbers) {
        String fizz = "fizz";
        String buzz = "buzz";
        String fizzbuzz = "fizzbuzz";
        String lucky = "lucky";
        String result = "";
        String space = " ";
        int fizzCount = 0, buzzCount = 0, fizzBuzzCount = 0, luckyCount = 0, integerCount = 0;
        for(int number : rangeOfNumbers) {
            if (Integer.toString(number).contains("3")) {
                result = result + lucky + space;
                luckyCount += 1;
            }
            else if (number % 15 == 0) {
                result += fizzbuzz + space;
                fizzBuzzCount += 1;
            }
            else if (number % 3 == 0) {
                result += fizz + space;
                fizzCount += 1;
            }
            else if (number % 5 == 0) {
                result += buzz + space;
                buzzCount += 1;
            }
            else {
                result += Integer.toString(number) + space;
                integerCount += 1;
            }
        }
        String counts = "\n" + "fizz: " + Integer.toString(fizzCount) + "\n" + "buzz: " + Integer.toString(buzzCount) + "\n" + "fizzbuzz: " + Integer.toString(fizzBuzzCount) + "\n" + "lucky: " + Integer.toString(luckyCount) + "\n" + "integer: " + Integer.toString(integerCount);
        result = result + counts;
        System.out.println(result);
        return result;
    }
}

