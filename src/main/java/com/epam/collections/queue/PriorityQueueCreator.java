package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2)*-1;

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(comparator);
        priorityQueue.addAll(firstList);
        priorityQueue.addAll(secondList);

        return priorityQueue;
    }
}
