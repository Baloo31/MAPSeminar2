package com.company;

import java.util.List;

public class HorrorMovies extends Movie{
    public HorrorMovies(String title, int jahr, double rating,
                        List<String> cast, double basePrice, MovieDiscountCalculator discount) {
        super(title, jahr, rating, cast, basePrice, discount);
    }

    @Override
    public double calculatePrice(){
        return 0.9 * super.getBasePrice();
    }
}
