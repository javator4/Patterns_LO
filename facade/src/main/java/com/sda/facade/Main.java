package com.sda.facade;

public class Main {
    public static void main(String[] args) {
        // Tworzymy 4 klasy
        // User
        // Product
        // Cart
        // API


        API api = new API(new User(), new Cart(), new Product());
        api.register();
        api.login();
        api.getCategoryByName("AGD");


    }
}
