import java.util.Scanner;
public class prime_number_static {
    static void num() {
        int n, m = 0, i, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        n = sc.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("not prime number");
        }
        else{
            for(i=2;i<=m;i++)
            {
                if(n%i==0){
                    System.out.println("not a prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime number");
            }
        }
    }

    public static void main(String[] args) {
        prime_number_static.num();
    }
    }

