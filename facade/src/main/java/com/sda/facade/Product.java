package com.sda.facade;

public class Product {

    public void getAll(){
        System.out.println("Zwracam wszystkie produkty");
    }

    public void getByCategory(String category){
        System.out.println("Produkty z kategorii " + category);
    }


}
