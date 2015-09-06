package com.chyrta.LinkedList;

public class LinkListApp {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(22, 5.666);
        linkList.insertFirst(55, 6.335);
        linkList.insertFirst(52, 5.286);

        linkList.displayList();

        while(!linkList.isEmpty()) {
            Link aLink = linkList.deleteFirst();
            System.out.print("Deleted");
            aLink.displayLink();
            System.out.println("");
        }

        linkList.displayList();

    }

}
