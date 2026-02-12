package String;
import java.util.*; 
public class String1 {
    public static void main(String[] args) {
        int[] a={35,85,56,45,28,59,76,49,37,91,89,54};
        System.out.println(a[3]);
        String s1=Arrays.toString(a);
        System.out.println(s1);
        Arrays.sort(a);
        String s2=Arrays.toString(a);
        System.out.println(s2);
    }
}
