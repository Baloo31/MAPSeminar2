package com.company;
import java.util.List;
import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private List<Order> orders;

    public User(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.orders=new ArrayList<Order>();
    }

    public void addOrder(Order newOrder){
        orders.add(newOrder);
    }

    public double calculateTotalPriceForOrder(int index){
        return orders.get(index).calculateTotalPrice();
    }
    public double claculateTotalPriceForAllOrders(){
        double sum=0;
        for (Order x: orders){
            sum += x.calculateTotalPrice();
        }
        return sum;
    }
}
