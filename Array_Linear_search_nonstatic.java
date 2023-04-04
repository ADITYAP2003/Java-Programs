import java.util.Scanner;
public class Array_Linear_search_nonstatic {
    void array(){
        int [] a =new int[5];
        int n,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of the array :");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element u want to search");
        n=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(n==a[i]){
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Number found");
        else
            System.out.println("number not found");
    }

    public static void main(String[] args) {
       Array_Linear_search_nonstatic obj=new Array_Linear_search_nonstatic();
       obj.array();
    }
}