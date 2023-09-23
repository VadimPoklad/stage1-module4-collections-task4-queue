package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=1; i<=numberOfDishes;i++){
            queue.add(i);
        }


        Iterator<Integer> iterator;
        int step=everyDishNumberToEat-1;
        int i = 0;
        if(!queue.isEmpty()){
            while(queue.size()!=1){
                i = (i + step) % queue.size();
                iterator = queue.iterator();
                int n=0;
                for (int r=0; r<=i; r++) {
                    n = iterator.next();
                }
                queue.remove(n);
                list.add(n);
            }
            list.add(queue.poll());
        }

        return list;
    }

}

