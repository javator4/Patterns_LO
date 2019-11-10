package com.sda.patterns;

public class App
{
    static class Task1 implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
            singletonEnum.connection();
            System.out.println(singleton);
        }
    }

    static class Task2 implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
            singletonEnum.connection();
            System.out.println(singleton);
        }
    }

    public static void main( String[] args ) throws InterruptedException {
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());
        thread1.start();
        thread2.start();

        System.out.println("=======");
        //to samo dla klasy Task2

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
