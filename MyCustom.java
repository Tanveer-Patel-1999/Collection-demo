package com.demo;

import java.util.ArrayList;
import java.util.List;
//T is work with all type
//public class MyCustom<T> {

//<T extends Number> it is work with only number
public class MyCustom<T extends Number> {
    List<T> list = new ArrayList();

    //add element in a list
    public void addElement(T element) {
        list.add(element);
    }

    //remove element in alist
    public void removeElement(T element) {
        list.remove(element);
    }

    //get a element from a list
    public T get(int index) {
        return list.get(1);
    }

    //print a list
    public String toString() {
        return list.toString();
    }

}
