package com.example.demo;


import flower.store.payment.CreditCardPaymentStrategy;
import flower.store.payment.PayPalPaymentStrategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    @Test
    void testCreditCard() {
        CreditCardPaymentStrategy credit = new CreditCardPaymentStrategy();
        Assertions.assertEquals(credit.pay(10.0), "Payed 10.0 UAH with credit card.");
    }

    @Test
    void testPayPal() {
        PayPalPaymentStrategy credit = new PayPalPaymentStrategy();
        Assertions.assertEquals(credit.pay(10.0), "Payed 10.0 UAH with PayPal.");
    }
}
