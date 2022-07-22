package com.platzi.javatests.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double decimalDiscount;

    public double getTotal() {
        double result = 0.0;
        for (Double price : prices) {
            result += price;
        }
        return result*decimalDiscount;
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public double setDiscount(double discount) {
        decimalDiscount = 1-(discount / 100.0);
        return decimalDiscount;
    }
    
}
