package com.company;

import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    ComedyMovies comedy1 = new ComedyMovies("TitluComedie1", 1999, 3,
                Arrays.asList("Adam Sandler", "Nume1", "Nume3"), 100, new HorrorMovieDiscount());
        System.out.println(comedy1.calculatePrice());

        User user1=new User("First Name", "Last Name");
        OrderLine ol1=new OrderLine(comedy1, 10);

        Order o=new Order(new Date(), Arrays.asList(ol1));
        user1.addOrder(o);
        System.out.println(user1.calculateTotalPriceForOrder(0));
        System.out.println(user1.claculateTotalPriceForAllOrders());
    }
}
