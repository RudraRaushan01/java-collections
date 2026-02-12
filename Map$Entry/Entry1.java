package Map$Entry;
import java.util.*;
public class Entry1 {
    public static void main(String[] args) {
        TreeMap<Integer,Float> tm=new TreeMap<>();
        tm.put(201, 5000.00f);
        tm.put(101, 4500.00f);
        tm.put(301, 5500.00f);
        tm.put(401, 6000.00f);
        tm.put(501, 6500.00f);
        System.out.println(tm);
    }
}
