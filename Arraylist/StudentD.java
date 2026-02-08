import java.util.*;
class Student{
    int erpId;
    String name;
    int rollNo;
    Student(int erpId, String name, int rollNo){
        this.erpId=erpId;
        this.name=name;
        this.rollNo=rollNo;
    }
    public String toString(){
        return erpId+"\t"+name+"\t"+rollNo;
    }
}
public class StudentD {
    public static void main(String[] args) {
        System.out.println("Employee Details: ");
        Student st=new Student(328, "Raushan", 270);
        Student st2=new Student(305, "Rakesh", 258);
        Student st3=new Student(308, "Ritik", 255);
        ArrayList<Student> s=new ArrayList<>();
        s.add(st);
        s.add(st2);
        s.add(st3);
        System.out.println(s);
    }
}
