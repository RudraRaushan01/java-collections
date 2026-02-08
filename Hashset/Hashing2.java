package Hashset;
import java.util.*;
public class Hashing2 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        System.out.println("Each element Modulo by 16");
        hs.add(90);
        hs.add(67);
        hs.add(94);
        hs.add(20);
        hs.add(29);
        System.out.println(hs);
    }
}
