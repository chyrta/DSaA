package com.chyrta.LinkStack;

public class LinkList {

    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(long dData) {
        Link newLink = new Link(dData);
        newLink.next = first;
        first = newLink;
    }

    public long deleteFifrst() {
        Link temp = first;
        first = first.next;
        return temp.dData;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }


}