package org.example;

public class ExpressShipping implements ShippingStragety {
    private double distanceKm;

    public ExpressShipping(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    @Override
    public double calculateFee(double weight) {
        return 30000 + weight * 10000 + distanceKm * 2000;

    }
}
