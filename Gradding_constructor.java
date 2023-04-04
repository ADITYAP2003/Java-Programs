import java.util.Scanner;
public class Gradding_constructor {
    Gradding_constructor(){
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks :");
        marks=sc.nextInt();
        if(marks>=80){
            System.out.println("Distinction");
        }
        else if(marks>=70){
            System.out.println("First class");
        }
        else if(marks>=60){
            System.out.println("Second class");
        }
        else if(marks>=40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Gradding_constructor obj=new Gradding_constructor();
    }
}
