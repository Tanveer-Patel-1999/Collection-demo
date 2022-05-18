package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {

    Calculator calculator;

    @BeforeEach
    public void init()
    {
        calculator = new Calculator();
    }

    @Nested
    class addPostiveNumber
    {
        @Test
        public void addSmallPositiveNumber()
        {
            int sum = calculator.add(3,5);
            System.out.println(sum);
        }

        @Test
        public void addBigPositiveNumber()
        {
            int sum = calculator.add(300,500);
            System.out.println(sum);
        }
    }

    @Nested
    class addNegativeNumber
    {
        @Test
        public void addBigNegativeNumber()
        {
            int sum = calculator.add(-300,-500);
            System.out.println(sum);
        }

        @Test
        public void addSmallNegativeNumber()
        {
            int sum = calculator.add(-3,-5);
            System.out.println(sum);
        }
    }

    @Nested
    class addZeroNumber
    {
        @Test
        public void addBigNegtiveZeroNumber()
        {
            int sum = calculator.add(-0,-0);
            System.out.println(sum);
        }
        @Test
        public void addBigPostiveZeroNumber()
        {
            int sum = calculator.add(0,0);
            System.out.println(sum);
        }
    }

    //Positive cases







}
