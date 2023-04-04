import java.util.Scanner;
public class Array_descending_order {
    public static void main(String[] args) {
        int [] a=new int[5];
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of the array :");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in descending order is :");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}
