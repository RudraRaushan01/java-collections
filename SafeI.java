// import java.lang.reflect.Array;
import java.util.*;

class SafeI{
    public static void main(String[] args) {
        System.out.println("Safe Generics Example");
        ArrayList<Integer> al=new ArrayList<>();
        al.add(20);
        al.add(89);
        al.add(45);
        al.add(108);
        //al.add("Hello");  // This line will cause a compile-time error
        System.out.println(al);
    }
}