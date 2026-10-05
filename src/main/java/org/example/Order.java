package org.example;

public class Order {
    private double weight;
    private double distanceKm;

    public Order(double weight , double distanceKm) {
        this.weight= weight;
        this.distanceKm= distanceKm;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private ShippingStragety shippingStragety;

    public void setPayment(ShippingStragety shippingStragety) {
        this.shippingStragety = shippingStragety;
    }
    public double totalAmount(double weight , double distanceKm ){
        if (this.shippingStragety == null){
            throw new RuntimeException("null");
        }
        return shippingStragety.calculateFee(weight);
    }
}
