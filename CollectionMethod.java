package com.demo;

import java.util.*;

public class CollectionMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

      List<Integer> list1 = new ArrayList<Integer>();
        //1:add() method is used to add the element in collection
        list1.add(9);
        list1.add(8);
        System.out.println(list1);

        //2:addAll() method is used to add all element of one collection into another collection
        list1.addAll(list);
        System.out.println(list1);

        //3:get() method is used to get the element from the collection
        System.out.println(list.get(0));

        //4:remove() method is used to remove the element from the collection
        list.remove(2);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(6);
        list2.add(1);
        list2.add(8);
        list2.add(14);
        list2.add(30);
        list2.add(15);
        System.out.println(list2);

        //5:removeAll() method is used to remove all elwement from the collection to another collection which are matching
        // it is used to remove amtching element
        //System.out.println(list2.removeAll(list));


      /*  System.out.println(list2);
        //6:conatins() method check the element is present or not in the coolection
        System.out.println(list.contains(1));

        //7:isEmpty() method check collection is empty or not
        System.out.println(list2.isEmpty());


        //8:size() method is used to check the size of  a collection
        System.out.println(list.size());
        */


        //9:clear() method is used to remove all element from collection it return void
       /* list.clear();
        System.out.println(list);*/

        //10: set() method is used to add the element into a specific postion
       /* list.set(1,6);
        System.out.println(list);

        //11:Iterator() method is used to get the element one by one from a collection
        Iterator iterator =list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //12:indexOf() method is used to check the elemnt position
        System.out.println(list.indexOf(3));

        //13:subList() method gives the element from one index position to another index postion "give sub list"
        System.out.println(list);
        System.out.println(list.subList(1,2));

        //14: toString() method is used to print a element
        System.out.println(list.toString());

        //15:hashCode() method return the hashcode value of collection
        System.out.println(list.hashCode());*/


        System.out.println("****----inbuild method----*");
        //1;Collections.sort() method is used to sort the element
        Collections.sort(list2);
        System.out.println(list2);


        //2:  Collections.reverse() method is used to reverse a collction eleemnt
        Collections.reverse(list);
        System.out.println(list);

        //3:



    }
}
