package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreditCardTest {
    CreditCard creditCard;

    @BeforeEach
    public void init()
    {
        creditCard = new CreditCard();
    }

/*
    @AfterEach
    public void done()
    {
        System.out.println("Test pass successfully");
    }

 */


    @Test
    public void testCardType1()
    {
        String result = creditCard.getCreditCard("3");
        Assertions.assertEquals("American Express",result);
    }

    @Test
    public void testCardType2()
    {
        String result = creditCard.getCreditCard("4");
        Assertions.assertEquals("Visa",result);
    }

    @Test
    public void testCardType3()
    {
        String result = creditCard.getCreditCard("5");
        Assertions.assertEquals("MasterCard",result);
    }

    @Test
    public void testCardType4()
    {
        String result = creditCard.getCreditCard("6");
        Assertions.assertEquals("Discover",result);
    }

    @Test
    public void testCardType5()
    {
        String result = creditCard.getCreditCard("10");
        Assertions.assertEquals("Card type is not found",result);
    }

    @Test
    public void testCardType7()
    {
        String result = creditCard.getCreditCard("");
        Assertions.assertEquals("Card type is not found",result);
    }

    @Test
    public void testCardType6()
    {
        String result = creditCard.getCreditCard(null);
        Assertions.assertEquals("",result);
    }
}
