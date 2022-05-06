package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Generic {

    static <X> X doubleValue(X value) {
        return value;
    }

    //all the lis methoeds are available n all the classes list it is generic method
    static <X extends List> void duplicate(X list) {

        list.addAll(list);
    }

    //any list that extends the number class is a valid list
    //? is wild card
    //it is a upper bound walid card
    static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        //  double pro = 1;
        for (Number number : numbers) {
            sum = sum + number.doubleValue();
            // pro = pro+number.doubleValue();
        }
        return sum;
        //  return pro;

    }


    //it is a lower bound with the help of this we can add diifernt value
    static void addACoupleOfValues(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(2.3);
        numbers.add(3.7f);
        numbers.add(4l);
    }


    public static void main(String[] args) {

        //doubleValue method
        String value = doubleValue(new String());
        Integer num = doubleValue(Integer.valueOf(5));
        ArrayList list = doubleValue(new ArrayList<>());


        //create a Arraylist
        ArrayList<Integer> arrayList = new ArrayList(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        duplicate(arrayList);
        System.out.println(arrayList);//[1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8]

        //create a linked list
        LinkedList<String> linkedList = new LinkedList<>(List.of("ab", "cd", "ce"));
        duplicate(linkedList);
        System.out.println(linkedList);//[ab, cd, ce, ab, cd, ce]

        //using foreach loop we print
        for (String val: linkedList)
        {
            System.out.println(val);
        }

        //using for loop
        for (int i=0; i<arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }


        //create a list n sum of number
        System.out.println("Sum=" + sumOfNumberList(List.of(1, 2, 3, 4, 5, 6)));
        System.out.println("Sum=" + sumOfNumberList(List.of(1.2, 2.3, 3.5, 4.6, 5.7, 6.9)));
        System.out.println("Sum=" + sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l, 6l)));

       //create a list for  addACoupleOfValues method
        List list1 = new ArrayList<Number>();
        addACoupleOfValues(list1);
        System.out.println(list1);

        //get the element from linkedlist
        System.out.println(linkedList.get(1));

        //Add integer in an list
     /*   MyCustom<Integer> myCustom = new MyCustom();
        myCustom.addElement(Integer.valueOf(1));
        myCustom.addElement(Integer.valueOf(2));
        myCustom.addElement(Integer.valueOf(3));
        myCustom.addElement(Integer.valueOf(4));

        //printing a element
        Iterator iterator =myCustom.list.iterator();
        {
            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
        }
        //printing a element
        System.out.println(myCustom); //[1, 2, 3, 4]

        //add string value in list
    /*  MyCustom<String> myCustom1 =new MyCustom();
        myCustom1.addElement("Tanveer");
        myCustom1.addElement("uttam");
        myCustom1.addElement("arbaz");
        myCustom1.addElement("manish");

        //printing a element
        Iterator iterator1 =myCustom1.list.iterator();
        {
            while (iterator1.hasNext())
            {
                System.out.println(iterator1.next());
            }
        }

        //printing a element
        System.out.println(myCustom1);

        //remove element from a list
        MyCustom<String> myCustom2 =new MyCustom();
        myCustom1.removeElement("arbaz");
        System.out.println(myCustom1);
        myCustom.removeElement(1);
        System.out.println(myCustom); */


    }


}

