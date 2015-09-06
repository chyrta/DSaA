package com.chyrta.LinkedList;

public class LinkListAppOptions {

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFirst(45, 454.454);
        list.insertFirst(586, 585.35);
        list.insertFirst(51, 482.48);

        list.displayList();

        Link found = list.find(51);
        if (found != null) {
            System.out.println("Found link with key " + found.iData + " data");
        } else {
            System.out.println("Cant find desired link");
        }

        Link deleted = list.delete(586);
        if (deleted != null) {
            System.out.println("Deleted link with key " + deleted.iData + " data");
        } else {
            System.out.println("Cantt find link to delete");
        }

        list.displayList();

    }

}
