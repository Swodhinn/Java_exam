package models;

import java.util.Arrays;

public class Order {
    // defining variables to be used
    String name;
    String phonenum;
    int[] item;
    double[] price;
    //getter setters and constructor below
    public Order(String name, String phonenum, int[] item, double[] price) {
        this.name = name;
        this.phonenum = phonenum;
        this.item = item;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phonenum;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phonenum = phoneNumber;
    }

    public int[] getItems() {
        return item;
    }

    public void setItems(int[] items) {
        this.item = items;
    }

    public double[] getPrices() {
        return price;
    }

    public void setPrices(double[] prices) {
        this.price = prices;
    }

    //Creating a function named final bill to create the final bill which checks the array and loops it to
    //calculate the total sum and finds the VAT and returns it
    public void finalbill() {
        double total = 0;
        for (double price : price) {
            total = total+ price;
        }
        double vat = total * 0.13;
        System.out.println("Order details:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phonenum);
        System.out.println("Items: " + Arrays.toString(item));
        System.out.println("Prices: " + Arrays.toString(price));
        System.out.println("Total price: " + total);
        System.out.println("VAT (13%): " + vat);
        System.out.println("Total price with VAT: " + (total + vat));
    }
}
