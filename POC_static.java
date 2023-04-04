import java.util.Scanner;
public class POC_static {
    static void poc(){
        float r,pc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of r :");
        r=sc.nextInt();
        pc=(2*(22/7))*r;
        System.out.println("Perimeter of circle is :"+pc);
    }

    public static void main(String[] args) {
        POC_static obj=new POC_static();
        obj.poc();
    }
}
