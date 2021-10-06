package com.company;

import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        double initialPrice1 = 340;
	    ComedyMovies comedy1 = new ComedyMovies("TitluComedie1", 1999, 3,
                Arrays.asList("Adam Sandler", "Nume1", "Nume3"), initialPrice1, new ComedyMovieDiscount());
        System.out.println(comedy1.calculatePrice());

        User user1=new User("First Name", "Last Name");
        OrderLine ol1=new OrderLine(comedy1, 10);

        Order o=new Order(new Date(), Arrays.asList(ol1));
        user1.addOrder(o);
        System.out.println(user1.calculateTotalPriceForOrder(0));
        System.out.println(user1.claculateTotalPriceForAllOrders());


        double initialPrice2 = 100;
        HorrorMovies horror1 = new HorrorMovies("TitluHorror1", 2010, 4.5, Arrays.asList("a", "b"),
                initialPrice2, new HorrorMovieDiscount());
        System.out.println(horror1.calculatePrice());

        OrderLine ol2 = new OrderLine(horror1, 2);
        Order o2 = new Order(new Date(), Arrays.asList(ol2));
        user1.addOrder(o2);
        System.out.println(user1.calculateTotalPriceForOrder(1));
        System.out.println(user1.claculateTotalPriceForAllOrders());


        double initialPrice3 = 145;
        SciFiMovies scifi1 = new SciFiMovies("TitluSciFi", 2020, 5, Arrays.asList("..."),
                initialPrice3, new SciFiMovieDiscount());
        System.out.println(scifi1.calculatePrice());

        OrderLine ol3 = new OrderLine(scifi1, 1);
        Order o3 = new Order(new Date(), Arrays.asList(ol3));
        user1.addOrder(o3);
        System.out.println(user1.calculateTotalPriceForOrder(2));
        System.out.println(user1.claculateTotalPriceForAllOrders());
    }
}
