import java.util.Scanner;
public class Reverse_number_static {
    static void rev(){
        int n,r,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Number in reverse order is :"+rev);
    }

    public static void main(String[] args) {
        Reverse_number_static.rev();
    }
}
