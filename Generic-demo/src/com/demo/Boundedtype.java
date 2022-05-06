package com.demo;

public class Boundedtype {
    public static void main(String[] args) {
        //integer array
        Integer integerArray[] = {1,2,3,4,5};
        PrintSum<Integer> printSum = new PrintSum<>();
        printSum.print(integerArray);

        //double array
        Double doubleArray[] = {1.2,2.2,3.3};
        PrintSum<Double> printSum1 = new PrintSum<>();
        printSum1.print(doubleArray);


    }
}
