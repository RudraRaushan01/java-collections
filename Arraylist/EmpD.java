import java.util.*;
class Emp{
    int empNO;
    String name;
    float salary;
    Emp(int empNo, String name, float salary){
        this.empNO=empNo;
        this.name=name;
        this.salary=salary;
    }
    // Emp(int a, String b, float c){
    //     empNO=a;
    //     name=b;
    //     salary=c;
    // }

    public String toString(){
        return empNO+"\t"+name+"\t"+salary;
    }
}
public class EmpD {
    public static void main(String[] args) {
        System.out.println("EMployee Details: ");
        Emp e=new Emp(101, "Raj", 500.00f);
        Emp e1=new Emp(102, "Stephen", 5500.00f);
        Emp e2=new Emp(103, "John", 6500.00f);
        ArrayList<Emp> al=new ArrayList<>();
        al.add(e);
        al.add(e1);
        al.add(e2);
        System.out.println(al);

    }
    
}
