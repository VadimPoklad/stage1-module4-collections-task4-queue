package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        layCards(firstQueue,arrayDeque);
        layCards(secondQueue,arrayDeque);

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            firstQueue.add(arrayDeque.pollLast());
            layCards(firstQueue, arrayDeque);

            secondQueue.add(arrayDeque.pollLast());
            layCards(secondQueue, arrayDeque);
        }
        return arrayDeque;
    }

    private void layCards(Queue<Integer> Queue, ArrayDeque<Integer> arrayDeque) {
        for (int i=0;i<2;i++){
            if(!Queue.isEmpty()){
                arrayDeque.addLast(Queue.poll());
            }
        }
    }
}
