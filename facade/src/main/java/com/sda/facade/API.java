package com.sda.facade;

public class API {

    private User user;
    private Cart cart;
    private Product product;

    public API(User user, Cart cart, Product product) {
        this.user = user;
        this.cart = cart;
        this.product = product;
    }


    public void login(){
        this.user.login();
    }

    public void register(){
        this.user.register();
    }

    public void getProducts(){
        this.cart.getItems();
    }

    public void getCategoryByName(String category){
        this.product.getByCategory(category);
    }

}
