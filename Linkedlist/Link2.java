package Linkedlist;
import java.util.*;
public class Link2 {
    public static void main(String[] args) {
            LinkedList<String> ll=new LinkedList<>();
            ll.add("James Gosling");
            ll.add("Patrick Naughton");
            ll.add("aaaaaaa");
            ll.add("Mike Sheridon");
            System.out.println(ll);
            ll.add(2,"Chris Warmth");
            System.out.println(ll);
            ll.set(3,"Ed Frank");
            System.out.println(ll);
            System.out.println(ll.get(0));
    }
    
}
