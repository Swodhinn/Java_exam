package models;

import java.util.Arrays;

public class Tshirt {
    //defining variables here
    String name;
    String Description;
    int price;
    String[] size = new String[]{"X", "XL", "M", "S"};
    String productcode;
    //getter setter and constructor is generated

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public Tshirt(String name, String description, int price, String[] size, String productcode) {
        this.name = name;
        Description = description;
        this.price = price;
        this.size = size;
        this.productcode = productcode;
    }
    //Creating a function tshirt bill to generate the product details

    public void TShirtbill() {
        System.out.println("Item name: " + this.name);
        System.out.println("Description: " + this.Description );
        System.out.println("Product code: " + this.productcode);
        System.out.println("Price: " + this.productcode);
        System.out.println("Sizes: " + Arrays.toString(size));
    }


}


