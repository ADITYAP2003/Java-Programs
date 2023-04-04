public class Hybrid_inheritance {
    void eat(){
        System.out.println("eating");
    }
}
class doge extends Hybrid_inheritance{
    void bark(){
        System.out.println("barking");
    }
}
class cate extends Hybrid_inheritance{
    void drink(){
        System.out.println("drinking");
    }
}
class kit extends cate{
    void sleep(){
        System.out.println("sleeping");
    }
}
class meinclass{
    public static void main(String[] args) {
        kit s=new kit();
        doge d=new doge();
    s.sleep();
    s.drink();
    d.eat();
    d.bark();
    }
}
