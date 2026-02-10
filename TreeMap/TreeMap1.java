package TreeMap;
import java.util.*;
public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(1,"Amit");
        tm.put(2,"Vijay");
        tm.put(3,"Rahul");
        System.out.println(tm);
        tm.put(101, "Praveen");
        tm.put(105, "Suresh");
        tm.put(106, "Ramesh");
        tm.put(104, "Suresh");
        tm.put(102, "Ramesh");
        System.out.println(tm);
    }
}
