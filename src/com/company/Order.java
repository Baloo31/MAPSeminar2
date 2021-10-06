package com.company;
import java.util.List;
import java.util.Date;

public class Order {
    private Date orderDate;
    private List<OrderLine> orderLines;

    public Order(Date orderDate, List<OrderLine> orderLines) {
        this.orderDate = orderDate;
        this.orderLines = orderLines;
    }

    public double calculateTotalPrice(){
            double sum = 0;
            for (OrderLine x: orderLines){
                sum += x.calculatePrice();
            }
            return sum;
    }

    public void addOrderLine(OrderLine newOrderLine){
        orderLines.add(newOrderLine);
    }
}
