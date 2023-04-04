import java.util.Scanner;
public class Array_reverse_constructor {
    Array_reverse_constructor(){
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        size=sc.nextInt();
        int [] a=new int[size];
        System.out.println("Enter elements of the array :");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements in reverse order :");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Array_reverse_constructor obj=new Array_reverse_constructor();
    }
}
