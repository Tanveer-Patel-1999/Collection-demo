package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeOutTest {

    @Test
    @Timeout(1)
    public void timeOutTest() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("test pass with in a time");
    }

    @Test
    @Timeout(6)
    public void timeOutTest1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("test pass with in a time");
    }

    //in this method do not need to mention @TimeOut we can use assertTimeout()
    @Test
    public void timeOutTest2()
    {

        Assertions.assertTimeout(Duration.ofSeconds(7), () -> delaySeconds(6));
    }

    private void delaySeconds(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }
}
