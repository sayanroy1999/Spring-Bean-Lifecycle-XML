package com.example.demo5;

public class IPL {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("Setting price"); //This will be called 1st and then the init method
        this.price = price;
    }

    public IPL(int price) {
        this.price = price;
    }

    public IPL() {
    }

    @Override
    public String toString() {
        return "IPL{" +
                "price=" + price +
                '}';
    }

    //Init method
    public void hey()
    {
        System.out.println("Inside init method");
    }

    //Destroy method
    public void bye()
    {
        System.out.println("Inside Destroy method");
    }
}