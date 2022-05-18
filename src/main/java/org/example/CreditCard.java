package org.example;

public class CreditCard {

    public  String getCreditCard(String creditCardNumber) {

        String type = "";

        if (creditCardNumber != null)
        {
            if (creditCardNumber.startsWith("3"))
            {
                type = "American Express";
            } else if (creditCardNumber.startsWith("4"))
            {
                type = "Visa";
            } else if (creditCardNumber.startsWith("5"))
            {
                type = "MasterCard";
            } else if (creditCardNumber.startsWith("6"))
            {
                type = "Discover";
            }
            else {
                type = "Card type is not found";
            }
        }
        return type;
    }

    public static void main(String[] args) {
      /*  CreditCard creditCard = new CreditCard();
        System.out.println(creditCard.getCreditCard("3"));
        System.out.println(creditCard.getCreditCard("4"));
        System.out.println(creditCard.getCreditCard("5"));
        System.out.println(creditCard.getCreditCard("6"));
        System.out.println(creditCard.getCreditCard(""));
        System.out.println(creditCard.getCreditCard(null));

       */
    }
}

