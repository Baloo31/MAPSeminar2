package com.company;

public class OrderLine {
    private Movie movie;
    private int quantity;

    public OrderLine(Movie movie, int quantity){
        this.movie=movie;
        this.quantity=quantity;
    }

    public double calculatePrice(){
        return this.movie.calculatePrice() * this.quantity;
    }
}
