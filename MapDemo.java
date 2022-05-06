package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        //Adding an element
        map.put(1, "tas");
        map.put(2, "abc");
        map.put(3, "cd");

        //Traversing a element
        //first we have to convert into set
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("second way");
        //2nd way
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

       /* //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);*/
    }

}



