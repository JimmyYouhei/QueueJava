package com.jimmyyouhei.queue;

import java.util.ArrayList;

public class ArrayListQueue {

    private ArrayList<Object> arrayListQueue = new ArrayList<>();

    public void enqueue (Object toBeAdded){
        arrayListQueue.add(toBeAdded);
    }

    public void dequeue(){
        arrayListQueue.remove(0);
    }

    public Object peek(){

        return arrayListQueue.get(0);
    }

    public void print() {

        System.out.println("Here are all elements:");

        for (int i = 0 ; i< arrayListQueue.size(); i++){
            System.out.println(arrayListQueue.get(i));
        }
    }

}
