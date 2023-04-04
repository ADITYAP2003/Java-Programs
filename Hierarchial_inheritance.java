public class Hierarchial_inheritance {
    void eat(){
        System.out.println("Eating");
    }
}
class dogs extends Hierarchial_inheritance{
    void bark(){
        System.out.println("barking");
    }
}
class cats extends Hierarchial_inheritance{
    void drink(){
        System.out.println("drinking");
    }
}
class mein {
    public static void main(String[] args) {
dogs d=new dogs();
d.eat();
d.bark();
cats c=new cats();
c.drink();
    }
}