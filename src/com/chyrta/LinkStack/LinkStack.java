package com.chyrta.LinkStack;


public class LinkStack {

    private LinkList linkList;

    public LinkStack() {
        linkList = new LinkList();
    }

    public void push(long d) {
        linkList.insertFirst(d);
    }

    public long pop() {
        return linkList.deleteFifrst();
    }

    public boolean isEmpty() {
        return (linkList.isEmpty());
    }

    public void displayStack() {
        System.out.print("Stack (top->bottom): ");
        linkList.displayList();
    }

}
