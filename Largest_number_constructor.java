import java.util.Scanner;
public class Largest_number_constructor {
    Largest_number_constructor(){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a,b and c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is greatest");
        }
        else{
            if(b>c && b>a){
                System.out.println("b is greatest");
            }
            else{
                System.out.println("c is greatest");
            }
        }
    }

    public static void main(String[] args) {
        Largest_number_constructor obj=new Largest_number_constructor();
    }
}
