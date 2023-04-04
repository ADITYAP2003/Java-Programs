abstract class main{
    abstract void draw();
}
class circle extends main{
void draw() {
    System.out.println("Drawing circle");
}
}
class rectangle extends main{
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class test{
    public static void main(String[] args) {
        main s1=new circle();
        main s2=new rectangle();
        s1.draw();
        s2.draw();
    }
}