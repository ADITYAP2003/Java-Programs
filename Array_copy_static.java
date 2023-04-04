import java.util.Scanner;
public class Array_copy_static {
    static void array(){
       int [] a=new int[5];
       int [] b=new int[5];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter elements of array a :");
       for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
       }
       System.out.println("elements of array b is :");
       for(int i=0;i<b.length;i++){
           b[i]=a[i];
           System.out.println(b[i]);
       }
    }

    public static void main(String[] args) {
        Array_copy_static.array();
    }
}
