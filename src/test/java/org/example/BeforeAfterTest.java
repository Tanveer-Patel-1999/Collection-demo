package org.example;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {

    Calculator calculator; //class level object


    // @BeforeAll and @AfterAll method should be static
    @BeforeAll
    //it will be executed only one time per class before executing All test() method n method should be public
    static void beforeAllMethod()
    {
        System.out.println("Establish connection to the database..");
    }

    //it will be executed only one time per class after executing All test() method n method should be public
    @AfterAll
    static void afterAllMethod()
    {
        System.out.println("closing connection to the data base.. ");
    }

    //it is used to avoid a duplicate code "Calculator calculator = new Calculator();"
    @BeforeEach //for each test method before executing each test method it will execute beforeEach() methd
    public void init()
    {
        calculator = new Calculator();
        System.out.println("Initializing the calculator");
    }

    @Test
    @DisplayName("Adding two positive number")
    public void testMethod1() {
       // calculator = new Calculator();
        int sum = calculator.add(20, 60);
        System.out.println("Total sum=" + sum);

    }

    @DisplayName("Adding two negative number")
    @Test
    public void testMethod2() {
       // calculator = new Calculator();
        int sum = calculator.add(-20, -30);
        System.out.println("total sum = " + sum);

    }


    @AfterEach //if u want to execute the  som set of code after completion of each n every test method the code will go into @AfterEach
    public void testDemo()
    {
        System.out.println("test method executed successfully");
    }
}
