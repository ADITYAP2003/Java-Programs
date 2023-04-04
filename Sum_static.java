import java.util.Scanner;

public class Sum_static{
static void add(){
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter values of a and b :");
    a=sc.nextInt();
    b=sc.nextInt();
    c=a+b;
    System.out.println("Addition is :"+c);
}

    public static void main(String[] args) {
        Sum_static.add();
    }
}