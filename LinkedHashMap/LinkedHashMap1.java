import java.util.LinkedHashMap;
public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(1,"Amit");
        lhm.put(2,"Vijay");
        lhm.put(3,"Rahul");
        System.out.println(lhm);
        lhm.put(101, "Praveen");
        lhm.put(105, "Suresh");
        lhm.put(106, "Ramesh");
        lhm.put(104, "Suresh");
        lhm.put(102, "Ramesh");
        System.out.println(lhm);
    }
}
