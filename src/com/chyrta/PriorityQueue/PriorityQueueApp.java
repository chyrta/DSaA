package com.chyrta.PriorityQueue;

public class PriorityQueueApp {

    public static void main(String[] args) {

        PriorityQueue priorityQueue = new PriorityQueue(5);

        priorityQueue.insert(10);
        priorityQueue.insert(100);
        priorityQueue.insert(50);
        priorityQueue.insert(80);

        while(!priorityQueue.isEmpty()) {
            long item = priorityQueue.remove();
            System.out.print(item + " ");
        }

    }

}
