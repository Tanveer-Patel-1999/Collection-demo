package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExpectedExceptionTest {

    @Test
    public void expectedException()
    {
        Assertions.assertThrows(ArithmeticException.class, () -> div(1,0));
        System.out.println("Test passed as we handle the exception");
    }

    @Test
    public void expectedException1()
    {
        Assertions.assertThrows(FileNotFoundException.class, () -> readFile());
        System.out.println("Test passed as we handle the exception");
    }

    //super type exception
    @Test
    public void expectedException2()
    {
        Assertions.assertThrows(IOException.class, () -> readFile());
        System.out.println("Test passed as we handle the exception");
    }


    private int div(int a, int b)
    {
        return a/b;
    }


    private void readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./abcd.xis");
        fileInputStream.read();
        fileInputStream.close();
    }
}
