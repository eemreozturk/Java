package org.example;

public class products implements Iproducts{
    public int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public products() {
    }

    public products(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String name;
    public double price;
}
