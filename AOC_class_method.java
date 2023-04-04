import java.util.Scanner;
public class AOC_class_method {
    float ac;
    void mymethod(int r){
        ac=(22/7)*r*r;
    }
}
class meain {
    public static void main(String[] args) {
int r1;
Scanner sc=new Scanner(System.in);
System.out.println("enter value of r1 :");
r1=sc.nextInt();
AOC_class_method obj=new AOC_class_method();
obj.mymethod(r1);
System.out.println("Area is :"+obj.ac);
    }
}
