package com.sda.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class SampleIterator implements Iterator {

    private int position = 0;
    private String dataset[];

    public SampleIterator(String[] dataset) {
        this.dataset = dataset;
    }

    public boolean hasNext() {
        if(position < dataset.length){
            return true;
        }
        return false;
    }

    public String next() {
        if(this.hasNext()) {
            return dataset[position++];
        }
        return null;
    }

    public void remove() {

    }


}
