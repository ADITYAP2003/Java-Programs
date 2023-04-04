import java.util.Scanner;
public class SumOfNumber_constructor
{
    SumOfNumber_constructor(){
        int n,r,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n :");
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of entered number is :"+sum);
    }

    public static void main(String[] args) {
        SumOfNumber_constructor obj=new SumOfNumber_constructor();
    }
}
