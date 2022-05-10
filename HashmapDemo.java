package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Tanveer");
        map.put(2,"Anik");
        map.put(3,"Rida");

        //1:simple
        System.out.println(map);

        //2:get the value
        System.out.println(map.get(1));


        //it return the key only using keyset
        for (Integer itr :map.keySet())
        {
            System.out.println(itr);
        }

        //it return value
        for (Integer itr :map.keySet())
        {
            System.out.println(map.get(itr));
        }

        //iterate hashmap it print key n value
       Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            //System.out.println(iterator.getKey()+ " "+iterator.getValue());
        }

        //Traversing a element
        //first we have to convert into set
     /*   Set set = map.entrySet();
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/


        //for each llop
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //checking size
        System.out.println(map.size());


        //check map is empty or not
        System.out.println(map.isEmpty());

        //delete all emenet from map
       // map.clear();
        System.out.println(map);

        //remove alement
        System.out.println(map.remove(1));
        System.out.println(map);



    }
}
