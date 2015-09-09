package com.chyrta.FirstLastList;

/**
 * Created by Dzmitry Chyrta on 10.09.15.
 */
public class Link {

    public long dData;
    public Link next;

    public Link(long d) {
        this.dData = d;
    }

    public void displayLink() {
        System.out.println(dData + " ");
    }

}
