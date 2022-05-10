package com.demo;

import com.demo.com.demo.Glass;
import com.demo.com.demo.Juice;

public class Guest {
    public static void main(String[] args) {
        Glass<Juice> glass = new Glass<Juice>();
        Juice juice = new Juice();
        glass.liquid=juice;


        Glass<Water> glass1 = new Glass<Water>();
        Water water = new Water();
     //   Water water1 =waterGlass.liquid;


        //retriew
        Juice juice1=glass.liquid;
    }
}
