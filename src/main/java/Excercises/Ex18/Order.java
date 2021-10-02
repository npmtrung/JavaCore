package Excercises.Ex18;

import java.time.LocalDate;

public class Order {
    private LocalDate date;
    private String customer;
    private double total;


    public Order() {
    }

    public Order(LocalDate date, String customer, double total) {
        this.date = date;
        this.customer = customer;
        this.total = total;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", customer='" + customer + '\'' +
                ", total=" + total +
                '}';
    }
}
