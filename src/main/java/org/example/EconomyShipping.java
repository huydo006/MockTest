package org.example;

public class EconomyShipping implements ShippingStragety {
    @Override
    public double calculateFee(double weight) {
        return 10000 + 3000*weight;
    }
}
