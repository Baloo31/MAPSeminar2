package com.company;

import java.util.List;

public class SciFiMovies extends Movie{
    public SciFiMovies(String title, int jahr, double rating,
                        List<String> cast, double basePrice, MovieDiscountCalculator discount) {
        super(title, jahr, rating, cast, basePrice, discount);
    }

    /*
    @Override
    public double calculatePrice() {
        return super.getBasePrice();
    }
    */
}
