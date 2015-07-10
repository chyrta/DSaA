package com.chyrta.InsertSort;

public class InsertSort {

    private long[] a;
    private int nElems;

    public InsertSort(int maxSize) {
        a = new long[maxSize];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    public void insertSort() {

        int in, out;

        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in -1] >= temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }

    }

}
