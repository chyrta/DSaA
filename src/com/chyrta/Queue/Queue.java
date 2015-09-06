package com.chyrta.Queue;

public class Queue {

    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        if (rear == maxSize-1)
            rear = -1;
            queueArray[++rear] = j;
            nItems++;
    }

    public long remove() {
        long temp = queueArray[front++];
        if (front == maxSize)
            front = 0;
            nItems--;
            return temp;
    }

    public long peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

}
