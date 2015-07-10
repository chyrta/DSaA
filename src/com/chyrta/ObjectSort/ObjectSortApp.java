package com.chyrta.ObjectSort;

public class ObjectSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ArrayObject array;
        array = new ArrayObject(maxSize);

        array.insert("Evans", "Petty", 10);
        array.insert("Smith", "Lora", 20);
        array.insert("Slabodchenko", "Nikita", 19);
        array.insert("Prosmitsky", "Michael", 21);
        array.insert("Stimson", "Henry", 33);

        System.out.print("Before sorting operation");
        array.display();

        array.insertSort();

        System.out.print("After sorting operation");
        array.display();


    }

}
