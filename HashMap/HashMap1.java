package HashMap;
import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Amit");
        hm.put(2,"Vijay");
        hm.put(3,"Rahul");
        System.out.println(hm);
        hm.put(101, "Praveen");
        hm.put(105, "Suresh");
        hm.put(106, "Ramesh");
        hm.put(104, "Suresh");
        hm.put(102, "Ramesh");
        System.out.println(hm);
    }
}
