package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    /**
     * 1. condition on operating system
     * 2.condition on particular JRE
     * 3.condition on jre range
     * 4.condition on System properties
     */

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void ConditionOnOS()
    {
        System.out.println("execute this test only in mac machine");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    public void conditionOnJRE()
    {
        System.out.println("Execute the test only for java 11");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8,max = JRE.JAVA_11)
    public void conditionOnJreRange()
    {
        System.out.println("Execute the test only for range 8 - 11");
    }

    @Test
    public void conditionOnSystemProperty()
    {
        System.out.println(System.getProperty("use.dir"));
    }
}
