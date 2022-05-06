package com.demo;

public class First<T> {
 public static <E> void printArray(E[] elements)
 {
     for (E element: elements
          ) {
         System.out.println(element);
     }

 }

}
