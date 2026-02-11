package ArrayIterator;
import java.util.*;
public class ArrayIterate1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(19);
        al.add(28);
        al.add(89);
        System.out.println(al);
        Iterator<Integer> itr=al.iterator();
        while(itr.hasNext()){
            int x=itr.next();
            System.out.println(x+5);
            // System.out.println(itr.next());
        }
        System.out.println(al);
        System.out.println("Using for each loop");
        for(int x:al){
            System.out.println(x+5);
        }
    }
}
