package com.sda.patterns;

public class Singleton {

    private static Singleton instance;
    private Singleton(){
    }

    public synchronized static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            System.out.println("Tworze instancje");
        }
        return instance;
    }

}
