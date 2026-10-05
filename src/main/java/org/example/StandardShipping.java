package org.example;

public class StandardShipping implements ShippingStragety {
    @Override
    public double calculateFee(double weight) {
        return 15000 + weight * 5000;
    }
}
