import java.util.Scanner;
public class AOT_class_method {
   float aot;
   void mymethos(int b, int h){
       aot=(1/2)*b*h;
   }
}
class maeein{
    public static void main(String[] args) {
        int s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of b and h :");
        s1=sc.nextInt();
        s2=sc.nextInt();
        AOT_class_method obj=new AOT_class_method();
        obj.mymethos(s1,s2);
        System.out.println("Area of triangle is :"+obj.aot);
    }
}
