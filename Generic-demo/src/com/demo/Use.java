package com.demo;

import static com.demo.First.printArray;

public class Use {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Character[] charArray = {'A','B','C','D'};
        System.out.println("integer array");
        printArray(intArray);
        System.out.println("character array");
        printArray(charArray);
    }
}
