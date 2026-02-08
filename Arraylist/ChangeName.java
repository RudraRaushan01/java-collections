import java.util.ArrayList;

public class ChangeName {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("James Gosling");
        al.add("Patrick Naughton");
        al.add("aaaaaaa");
        al.add("Mike Sheridon");
        System.out.println(al);
        al.add(2,"Chris Warmth");
        System.out.println(al);
        al.set(3,"Ed Frank");
        System.out.println(al);
        System.out.println(al.get(0));
    }
    
}
