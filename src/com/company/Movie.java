package com.company;
import java.util.List;

public abstract class Movie {
    private String title;
    private int jahr;
    private double rating;
    private List<String> cast;
    private double basePrice;
    private MovieDiscountCalculator discount;

    public Movie(String title, int jahr, double rating,
                 List<String> cast, double basePrice, MovieDiscountCalculator discount){
        this.title=title;
        this.jahr=jahr;
        this.rating=rating;
        this.cast=cast;
        this.basePrice=basePrice;
        this.discount=discount;
    }

    public double calculatePrice(){
        return discount.calculatePrice(this.basePrice);
    }

    public double getBasePrice() {
        return this.basePrice;
    }
    public List<String> getCast() {
        return this.cast;
    }
}


