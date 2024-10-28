package com.example.demo;


import flower.store.CreditCardPaymentStrategy;
import flower.store.PayPalPaymentStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    @Test
    void testCreditCard() {
        CreditCardPaymentStrategy credit = new CreditCardPaymentStrategy();
        Assertions.assertEquals(credit.pay(), "Payed for order with credit card.");
    }

    @Test
    void testPayPal() {
        PayPalPaymentStrategy credit = new PayPalPaymentStrategy();
        Assertions.assertEquals(credit.pay(), "Payed for order with PayPal.");
    }
}
