public class Multilevel_inheritance {
    void eat() {
        System.out.println("Eating");
    }
}
    class dog extends Multilevel_inheritance{
    void bark(){
        System.out.println("Barking");
    }
    }
    class cat extends dog{
    void drink(){
        System.out.println("drinking");
    }
    }
    class Maeinclass{
        public static void main(String[] args) {
            cat c=new cat();
            c.drink();
            c.bark();
            c.eat();
        }
    }

