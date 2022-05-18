package org.example.junit;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class JunitDemo {
    @Test
    public void testMethod()
    {
        Calculator calculator = new Calculator();
        int sum = calculator.add(20,60);
        System.out.println("Total sum="+sum);

    }
    @Test
    public void testMehod2()
    {
        Calculator calculator1 = new Calculator();
        int sum = calculator1.add(-20,-30);
        System.out.println("total sum = "+ sum);

    }

}
