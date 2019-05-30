package com.jimmyyouhei.queue;

public class Main {

    public static void main(String[] args) {
	// write your test here

        LinkedListQueue test = new LinkedListQueue();

        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.dequeue();

        test.print();

        System.out.println("----------------------------");

        ArrayListQueue test2 = new ArrayListQueue();

        test2.enqueue(1);
        test2.enqueue(2);
        test2.enqueue(3);
        test2.dequeue();

        test2.print();
    }
}
