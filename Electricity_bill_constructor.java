import java.util.Scanner;
public class Electricity_bill_constructor {
   Electricity_bill_constructor(){
       int n,sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter value of n:");
       n=sc.nextInt();
       if(n>=100){
           sum=(n*7);
           System.out.println(sum);
       }
       else if (n>=200) {
         sum=(n*8);
         System.out.println(sum);
       }
       else{
           sum=(n*9)+250;
           System.out.println(sum);
       }
   }

    public static void main(String[] args) {
        Electricity_bill_constructor obj=new Electricity_bill_constructor();
    }
}
