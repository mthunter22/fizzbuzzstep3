package com.fizzbuzz.app;

public class FizzBuzz
{
    private static int fizzCount = 0;
    private static int buzzCount = 0;
    private static int fizzBuzzCount = 0;
    private static int integerCount = 0;
    private static int luckyCount = 0;
    private static String transposeOutput = "";

    public static void main (String[] args) {
        //e.g. transpose range of number 1-20 via fizzbuzz
        int[] sampleRange = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(transpose(sampleRange));
    }

    public static String transposeOutput() {
        return transposeOutput;
    }

    public static String transpose(int[] rangeOfNumbers) {
        String output = "";
        for(int number : rangeOfNumbers) {
            output = output + luckyPrint(number);
            output = output + fizzBuzzPrint(number);
            output = output + fizzPrint(number);
            output = output + buzzPrint(number);
            output = output + integerPrint(number);

            output = output + " ";
        }
        output = output + "\n" + "fizz: " + getFizzCount() + "\n" + "buzz: " + getBuzzCount() + "\n" + "fizzbuzz: " + getFizzBuzzCount() + "\n" + "lucky: " + getLuckyCount() + "\n" + "integer: " + getIntegerCount();
        transposeOutput = output;
        return output;
    }

    public static String fizzPrint(int number) {
        String fizz = "";
        if (number % 3 == 0 && number % 15 != 0 && !Integer.toString(number).contains("3")) {
            fizz = "fizz";
            addOneToFizzCount();
        }
        return fizz;
    }

    private static void addOneToFizzCount() {
        fizzCount += 1;
    }

    public static String buzzPrint(int number) {
        String buzz = "";
        if (number % 5 == 0 && number % 15 != 0 && !Integer.toString(number).contains("3")) {
            buzz = "buzz";
            addOneToBuzzCount();
        }
        return buzz;
    }

    private static void addOneToBuzzCount() {
        buzzCount += 1;
    }

    public static String fizzBuzzPrint(int number) {
        String fizzBuzz = "";
        if (number % 15 == 0 && !Integer.toString(number).contains("3")) {
            fizzBuzz = "fizzbuzz";
            addOneToFizzBuzzCount();
        }
        return fizzBuzz;
    }

    private static void addOneToFizzBuzzCount() {
        fizzBuzzCount += 1;
    }

    public static String integerPrint(int number) {
        String integer = "";
        if (number % 15 != 0 && number % 5 != 0 && number % 3 != 0 && !Integer.toString(number).contains("3")) {
            integer = Integer.toString(number);
            addOneToIntegerCount();
        }
        return integer;
    }

    private static void addOneToIntegerCount() {
        integerCount += 1;
    }

    public static String luckyPrint(int number) {
        String lucky = "";
        if (Integer.toString(number).contains("3")) {
            lucky = "lucky";
            addOneToLuckyCount();
        }
        return lucky;
    }

    private static void addOneToLuckyCount() {
        luckyCount += 1;
    }

    public static int getFizzCount() {
        return fizzCount;
    }

    public static int getBuzzCount() {
        return buzzCount;
    }

    public static int getFizzBuzzCount() {
        return fizzBuzzCount;
    }

    public static int getIntegerCount() {
        return integerCount;
    }

    public static int getLuckyCount() {
        return luckyCount;
    }

}

