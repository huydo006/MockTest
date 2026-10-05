package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {


    //
    @Test
    void sucess (){
        Order o = new Order(15 , 5);
        ShippingStragety stragety = new ExpressShipping(o.getDistanceKm());
        o.setPayment(stragety);
        double except = 30000 + 15*10000 +5*2000;

        assertEquals(except,o.totalAmount(o.getWeight(),o.getDistanceKm()));
    }

    @Test
    void constructor_shouldThrowWhenWeightIsNegative() {
        assertThrows(RuntimeException.class, () -> new Order(-2.5, 10));
    }
}