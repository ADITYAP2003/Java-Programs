import java.util.Scanner;
public class Multiplication_table {
   static void mul(){
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter value of n :");
       n=sc.nextInt();
       System.out.println("Multiplication table is :");
       for(int i=1;i<=10;i++){
           System.out.println(n*i);
       }
   }

    public static void main(String[] args) {
        Multiplication_table.mul();
    }
}
