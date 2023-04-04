import java.lang.*;
public class Try_catch_exception {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        try{
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("exception handled....");
    }
}
