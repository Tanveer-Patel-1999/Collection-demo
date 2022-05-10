package com.demo.generic;

public class Guest1 {


    private static Anik anik;
    private static Rida rida;

    public static void main(String[] arg)
    {
        Colour<Red,Green,Blue> colour =new Colour<Red, Green, Blue>();
        Bartender bartender = new Bartender();
       
        bartender.<Anik, Rida>mix(anik,rida);
    }
}
