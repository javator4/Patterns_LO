package com.sda.iterator;

import java.util.Iterator;

public class Main implements Iterable<String>{

    private String[] dataset = {"1", "2", "3", "4"};

    public static void main(String[] args) {
//        SampleCollection sampleCollection = new SampleCollection();
//
//        while (sampleCollection.hasNext()){
//            System.out.println(sampleCollection.next());
//        }
        Main main = new Main();
        Iterator<String> iterator = main.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Override
    public Iterator<String> iterator() {
        return new SampleIterator(dataset);
    }
}
