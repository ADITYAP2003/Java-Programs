import java.util.Scanner;

public class Array_ascending_order {
    public static void main(String[] args) {
        int [] a=new int[3];
        Scanner sc=new Scanner(System.in);
        int temp=0;
        System.out.println("Enter elements of the array :");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements in ascending order is :");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
