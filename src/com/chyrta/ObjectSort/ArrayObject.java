package com.chyrta.ObjectSort;

public class ArrayObject {

    private Person[] a;
    private int nElems;

    public ArrayObject(int maxSize) {
        a = new Person[maxSize];
        nElems = 0;
    }

    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            a[j].displayPerson();
        System.out.println("");
    }

    public void insertSort() {

        int in, out;

        for (out = 1; out < nElems; out++) {
            Person temp = a[out];
            in = out;
            while (in > 0 && a[in-1].getLast().compareTo(temp.getLast()) > 0) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }

}
