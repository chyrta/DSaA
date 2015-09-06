package com.chyrta.Queue;


public class QueueWithoutCounterApp {

    public static void main(String[] args) {

        QueueWithoutCounter queue = new QueueWithoutCounter(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(50);

        System.out.print(queue.remove());

    }

}
