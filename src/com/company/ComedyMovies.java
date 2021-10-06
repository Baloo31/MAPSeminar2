package com.company;

import java.util.List;

public class ComedyMovies extends Movie{
    public ComedyMovies(String title, int jahr, double rating,
                        List<String> cast, double basePrice, MovieDiscountCalculator discount) {
        super(title, jahr, rating, cast, basePrice, discount);
    }

    /*
    @Override
    public double calculatePrice(){
        if(super.getCast().contains("Adam Sandler")){
            return 0.5 * super.getBasePrice();
        }
        else {
            return super.getBasePrice();
        }
    }
    */
}
