package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizationTest {
    /**
     * @ValueSource
     * @EnumSource
     * @MethodSource
     * @CsvFileSource
     * @ArgumentSource
     */


    //-------------------- @Valuesource ------------------------

    @ParameterizedTest(name = "{index} - Run est with args = {0}")
    @ValueSource(ints = {1,2,3,4,5})
    public void valueSourceTest(int args)
    {
        System.out.println(args);
    }

    @ParameterizedTest
    @ValueSource(strings= {"Apple","Orange","banana"})
    public void valurSourceTest2(String fruits)
    {
        System.out.println(fruits);
    }


    //------------------------ @EnumSource ---------------------------

    //first create a enum
    enum Fruits
    {
        apple,banana,orange,papaya;
    }

    @ParameterizedTest
    @EnumSource(Fruits.class)
    public void enumSourceTest(Fruits fruits)
    {
        System.out.println(fruits);
    }


    ///-------------------- @MethodSource -----------------
    //first u have to create a method
    private static String[] fruits()
    {
        return new String[] {"Apple","Mango","Orange"};
    }

    @ParameterizedTest
    @MethodSource("fruits")
    public void methodSourceTest(String fruits)
    {
        System.out.println(fruits);
    }

    //multiple value is passed in test
    private static Object[] values()
    {
        return new Object[][]
                {
                        {"java","programming language"},
                        {"junit","unit testing framework"},
                        {"github","Repository"},

                };
    }

    @ParameterizedTest
    @MethodSource("values")
    public void methodSourceTest1(String tech, String info)
    {
        System.out.println(tech +" --" +info);
    }


    //------------------- @CsvSource ------------------------------

    //comma suprated value
    @ParameterizedTest
    @CsvSource({
            "java,programming language",
            "junit,unit testing framework",
            "github,Repository"
    })
    public void valueSourceTest2(String tech, String info)
    {
        System.out.println(tech +" --" +info);
    }

}
