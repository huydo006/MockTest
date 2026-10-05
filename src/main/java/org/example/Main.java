package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Order o = new Order(15 , 5);
        ExpressShipping expressShipping= new ExpressShipping(5);

        o.setPayment(expressShipping);

        System.out.println(o.totalAmount(o.getWeight() ,o.getDistanceKm()));
    }


}
