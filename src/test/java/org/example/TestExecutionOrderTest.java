package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class TestExecutionOrderTest {

    @Test
    @Order(5)
    public void test1()
    {
        System.out.println("this is test1");
    }

    @Order(4)
    @Test
    public void Aest2()
    {
        System.out.println("this is test2");
    }


    @Order(3)
    @Test
    public void test3()
    {
        System.out.println("this is test3");
    }

    @Order(2)
    @Test
    public void test4()
    {
        System.out.println("this is test4");
    }

    @Order(1)
    @Test
    public void Best5()
    {
        System.out.println("this is test5");
    }

}
