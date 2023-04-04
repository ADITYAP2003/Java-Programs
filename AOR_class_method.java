import java.util.Scanner;
public class AOR_class_method {
    float ar;
    void mymethod(int l,int b,int h){
        ar=l*b*h;
    }
}
class maien{
    public static void main(String[] args) {
        int s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values :");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        AOR_class_method obj=new AOR_class_method();
        obj.mymethod(s1,s2,s3);
        System.out.println("Area is :"+obj.ar);
    }
}