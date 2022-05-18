package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Disabled
public class CaculatorTest {

    @Test //only used for public method protected
    @DisplayName("Adding two positive number") //give meaning full name
    @Disabled("not executing as the functionality is not working") //disabled the method
    public void testMethod1()
    {
        Calculator calculator = new Calculator();
        int sum = calculator.add(20,60);
        System.out.println("Total sum="+sum);

    }

    @DisplayName("Adding two negative number")
    @Test
    public void testMethod2()
    {
        Calculator calculator = new Calculator();
        int sum = calculator.add(-20,-30);
        System.out.println("total sum = "+ sum);

    }

    @Test
   // @DisplayName("Adding one +ve and one -ve number")
    public void testMethod3()
    {
        Calculator calculator = new Calculator();
        int sum = calculator.add(-20,30);
        System.out.println("total sum = "+ sum);

    }
}
