package TreeMap;
import java.util.*;
public class TreeMap2 {
    public static void main(String[] args) {
        TreeMap<Integer,Float> tm=new TreeMap<>();
        tm.put(101, 5000.00f);
        tm.put(102, 6000.00f);
        tm.put(103, 7000.00f);
        tm.put(104, 8000.00f);
        tm.put(105, 9000.00f);
        System.out.println(tm);
        Set<Map.Entry<Integer,Float>> s=tm.entrySet();
        Iterator<Map.Entry<Integer,Float>> it=s.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Float> me=it.next();
            int x=me.getKey();  
            float y=me.getValue();
            System.out.println(x+" "+y);
        }
    }
}