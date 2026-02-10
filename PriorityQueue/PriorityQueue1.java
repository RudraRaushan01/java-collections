package PriorityQueue;
import java.util.*;
public class PriorityQueue1 {
    public static void main(String[] args) {
        // PriorityQueue<String> pq=new PriorityQueue<>();
        // pq.add("Amit");
        // pq.add("Vijay");
        // pq.add("Rahul");
        // System.out.println(pq);
        // pq.add("Praveen");
        // pq.add("Suresh");
        // pq.add("Ramesh");
        // System.out.println(pq);
        // pq.offer("Simran");
        // pq.offer("Amit");
        // pq.offer("Simran");
        // pq.offer(null);
        // System.out.println(pq);

        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        pq1.offer(128);
        pq1.offer(64);
        pq1.offer(256);
        pq1.offer(32);
        System.out.println(pq1);
        System.out.println(pq1.peek());
        System.out.println(pq1.poll());
        System.out.println(pq1);
    }
}
