package com.demo;

public class PrintSum<T extends Number> {
    public void print(T[] arr)
    {
        double sum = 0;
        for (T value:arr
             ) {
            sum = sum+value.doubleValue();
        }
        System.out.println("sum="+sum);
    }
}
