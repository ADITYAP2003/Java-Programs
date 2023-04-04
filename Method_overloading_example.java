public class Method_overloading_example {
   static int sum(int a,int b){
       int result=a+b;
       return result;
   }
   static int sum(int a,int b,int c){
       int result=a+b+c;
       return result;
   }

    public static void main(String[] args) {
        System.out.println("Addition is :");
        int x=sum(1,2);
        System.out.println(x);
        System.out.println("Addition is :");
        int y=sum(1,2,3);
        System.out.println(y);
    }
}
