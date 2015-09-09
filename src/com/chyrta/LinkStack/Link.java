package com.chyrta.LinkStack;

public class Link {

    public long dData;
    public Link next;

    public Link(long d) {
        this.dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }

}
