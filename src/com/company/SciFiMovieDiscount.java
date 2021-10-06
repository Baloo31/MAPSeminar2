package com.company;

public class SciFiMovieDiscount implements MovieDiscountCalculator {
    @Override
    public double calculatePrice(double basePrice){
        return basePrice;
    }
}
