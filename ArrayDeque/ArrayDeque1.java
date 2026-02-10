package ArrayDeque;
import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(1);
        ad.add(90);
        ad.addFirst(38);
        ad.addLast(45);
        ad.offerFirst(19);
        ad.offerLast(67);
        System.out.println(ad);
    }
}
