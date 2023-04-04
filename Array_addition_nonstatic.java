import java.util.Scanner;
public class Array_addition_nonstatic {
    void array() {
       int [] a=new int [5];
        int [] b=new int [5];
        int [] c=new int [5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array a:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter elemnts of array b:");
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("arrray addition is :");
        for(int i=0;i<c.length;i++){
            c[i]=a[i]+b[i];
            System.out.println(c[i]);
        }
    }

    public static void main(String[] args) {
        Array_addition_nonstatic obj=new Array_addition_nonstatic();
        obj.array();
    }
}
