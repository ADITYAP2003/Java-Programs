import java.util.Scanner;
public class Percentage_nonstatic {
    void per(){
        int per,a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        per=((a+b+c)*100)/60;
        System.out.println("Percentage is :"+per);
    }

    public static void main(String[] args) {
        Percentage_nonstatic obj=new Percentage_nonstatic();
        obj.per();
    }
}
