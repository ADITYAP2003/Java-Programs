import java.util.Scanner;
public class Array_display_static {
   static void array(){
       int [] a=new int[5];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter elements of array :");
       for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
       }
      System.out.println("Array elements are :");
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
   }

    public static void main(String[] args) {
        Array_display_static.array();
    }
}
