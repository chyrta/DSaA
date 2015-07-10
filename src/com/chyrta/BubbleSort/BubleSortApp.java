package com.chyrta.BubbleSort;

public class BubleSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        BubbleSort array;
        array = new BubbleSort(maxSize);

        array.insert(77);
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(33);

        array.display();

        array.bubbleSort();

        array.display();

    }

}
