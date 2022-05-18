package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssertionTest {

    Calculator calculator;

    @BeforeEach
    public void init()
    {
        calculator = new Calculator();
    }

    //1>-- assertionEquals()---if both excepted and actual value same then it will pass the test
    @Test
    public void assertEqualsTest() {
        int sum = calculator.add(2, 3);

        Assertions.assertEquals(5, sum);

        // by using third parameter msg wwe will diaplay our own AssertionFailedError
        Assertions.assertEquals(5, sum, "Test fail as excepted value is not equal to actual value");
    }


    //2>-- assertionNotEquals()---if both excepted and actual value same then it will fail the test
    @Test
    public void assertNotEqualsTest() {
        int sum = calculator.add(2, 3);
        Assertions.assertNotEquals(4,sum,"Test failed as expected value is equal to actual value.");
    }


    //3---assertArrayEquals()  if both array are equals then it will pass the array
    @Test
    public void assertArrayEquals()
    {
       // Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3});
       // Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,3,2},"order is differnt");
        Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3,4},"array length is different");
    }

    @Test
    public void assertNullTest()
    {
        String str = null;
        String str1 = "Tanveer";
        Assertions.assertNull(str);
        Assertions.assertNotNull(str1);
    }

    @Test
    public void assertTrue()
    {
        boolean trueValue = true;
        boolean falseValue = false;
        Assertions.assertTrue(trueValue);
        Assertions.assertFalse(falseValue);
    }













        /*if (sum == 2)
        {
            System.out.println("test case pass");
        }
        else
        {
            System.out.println("test case fails");
        }

         */

    }

