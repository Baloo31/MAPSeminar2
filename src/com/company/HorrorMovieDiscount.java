package com.company;

public class HorrorMovieDiscount implements MovieDiscountCalculator{
    @Override
    public double calculatePrice(double basePrice){
        return 0.9 * basePrice;
    }
}
