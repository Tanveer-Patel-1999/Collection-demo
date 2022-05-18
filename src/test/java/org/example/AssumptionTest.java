package org.example;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionTest {

    @Test
    public void assumeTrueTest()
    {
        //if assumeTrue(true) test case is pass n if assumeTrue(false) test case is escape
        /*
        Assumptions.assumeTrue(false);
        System.out.println("Executing assumption is true");

         */

        //if u used if(true) aND if(false) test case is passed
        /*
        if(false)
            System.out.println("pass");

         */

        //if we used assertTrue(true) the test case is pass n if we used assertTrue(false) test case is fail
       /*
        Assertions.assertTrue(true);
        System.out.println("pass");

        */

    }
    @Test
    public void assumeFalseTest()
    {
        Assumptions.assumeFalse(false);
        System.out.println("passed");
    }
}
