package com.yakuperenermurat._06_;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MyQueue {
    public static void main(String[] args) {

        Queue <String> myQueue1 = new ArrayBlockingQueue<>(25);
        myQueue1.add("Abdullah");
        myQueue1.add("Fevzi");
        myQueue1.add("İsmail");
        myQueue1.add("Gözde");
        myQueue1.add("Veysel");
        //myQueue1.add(null); // OLMAZ!!!
        myQueue1.add("Barış");
        myQueue1.add("Barış");

        System.out.println(myQueue1);

        System.out.println("-----------------");

        Queue <String> myQueue2 = new PriorityQueue<>(25);
        myQueue2.add("Abdullah");
        myQueue2.add("Fevzi");
        myQueue2.add("İsmail");
        myQueue2.add("Barış");
        myQueue2.add("Gözde");
        myQueue2.add("Veysel");
        //myQueue2.add(null); // OLMAZ!!!
        myQueue2.add("Barış");
        myQueue2.add("Barış");
        myQueue2.add("Abdullah");

        System.out.println(myQueue2);

    }
}
