import java.util.Scanner;
public class Armstrong_nonstatic {
   void arm(){
       int n,r,sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of n:");
       n=sc.nextInt();
       while(n>0){
           r=n%10;
           sum=sum+(r*r*r);
           n=n/10;
       }
       if(sum==n){
           System.out.println("Armstrong number");
       }
       else{
           System.out.println("Not armstrong number");
       }
   }

    public static void main(String[] args) {
        Armstrong_nonstatic obj=new Armstrong_nonstatic();
        obj.arm();
    }
}
