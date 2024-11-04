package com.example.demo;

import flower.store.delivery.DHLDeliveryStrategy;
import flower.store.delivery.PostDeliveryStrategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeliveryTests {
    
    @Test
    void testDHLDelivery() {
        DHLDeliveryStrategy DHLDelivery = new DHLDeliveryStrategy();
        DHLDelivery.setAddress("Lviv, Street A");

        Assertions.assertEquals(DHLDelivery.getAddress(), "Lviv, Street A");
        Assertions.assertEquals(DHLDelivery.DeliveryNotification(), "Delivered with DHL");
    }

    @Test
    void testPostDelivery() {
        PostDeliveryStrategy PostDelivery = new PostDeliveryStrategy();
        PostDelivery.setAddress("Lviv, Street B");

        Assertions.assertEquals(PostDelivery.getAddress(), "Lviv, Street B");
        Assertions.assertEquals(PostDelivery.DeliveryNotification(), "Delivered with simple Post");
    }
}
