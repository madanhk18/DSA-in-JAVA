package madan;

import java.util.PriorityQueue;

public class prioque {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.offer(22);
        pq.offer(10);
        pq.offer(49);
        System.out.println(pq);
        pq.offer(1);
        pq.offer(88);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


    }
}
