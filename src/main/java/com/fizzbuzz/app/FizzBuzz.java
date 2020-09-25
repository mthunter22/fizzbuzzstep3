package com.fizzbuzz.app;

public class FizzBuzz
{
    public static void main( String[] args ) { }
    public static String transpose(int[] rangeOfNumbers) {
        String fizz = "fizz";
        String buzz = "buzz";
        String fizzbuzz = "fizzbuzz";
        String result = "";
        String space = " ";
        for(int number : rangeOfNumbers) {
            if (number % 15 == 0) {
                result += fizzbuzz + space;
            }
            else if (number % 3 == 0) {
                result += fizz + space;
            }
            else if (number % 5 == 0) {
                result += buzz + space;
            }
            else {
                result += Integer.toString(number) + space;
            }
        }
        System.out.println(result);
        return result;
    }
}
