package org.example;

import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

public class RepeatedTest {



    //first way of repeated
    @org.junit.jupiter.api.RepeatedTest(3)
    public void RepeatedTestMethod1()
    {
        System.out.println("i am executing test case multiple time");
    }

    //2nd way of repeated
    @org.junit.jupiter.api.RepeatedTest(value = 4, name = "{displayName} - repetition -{currentRepetition}/{totalRepetitions}" )
    public void RepeatedTestMethod2()
    {
        System.out.println("repeated test 2");
    }

  //  @org.junit.jupiter.api.RepeatedTest(value = 4, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void RepeatedTestMethod3()
    {
        System.out.println("repeated test 2");
    }

    @org.junit.jupiter.api.RepeatedTest(2)
    public void RepeatedTestMethod3(RepetitionInfo repetitionInfo)
    {
        System.out.println(repetitionInfo.getCurrentRepetition());
        System.out.println(repetitionInfo.getTotalRepetitions());
    }
}
