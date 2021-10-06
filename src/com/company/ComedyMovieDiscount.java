package com.company;

public class ComedyMovieDiscount implements MovieDiscountCalculator{
    public double calculatePrice(double basePrice){
        if (basePrice > 300){
            return 0.5 * basePrice;
        }
        else {
            return basePrice;
        }
    }
}
