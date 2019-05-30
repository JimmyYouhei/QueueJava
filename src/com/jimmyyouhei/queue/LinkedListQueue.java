package com.jimmyyouhei.queue;

import java.util.LinkedList;

public class LinkedListQueue {

    private LinkedList<Object> linkedListQueue = new LinkedList<>();

    public void enqueue (Object toBeAdded){
        linkedListQueue.addLast(toBeAdded);
    }

    public void dequeue (){
        linkedListQueue.removeFirst();
    }

    public Object peek(){
        return linkedListQueue.peek();
    }

    public void print(){
        System.out.println("Here are all elements:");

        for (int i = 0 ; i<linkedListQueue.size() ; i++) {

            System.out.println(linkedListQueue.get(i));

        }

    }

}
