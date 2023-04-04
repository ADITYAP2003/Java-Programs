public class Single_inheritance {
    void eat(){
        System.out.println("eating");
    }
}
class dogi extends Single_inheritance{
    void bark(){
        System.out.println("barking");
    }
}
class mains {
    public static void main(String[] args) {
dogi d=new dogi();
d.bark();
d.eat();
    }
}