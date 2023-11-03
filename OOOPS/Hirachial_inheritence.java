class A{
    public void show(){
        System.out.println("In A");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B");
    }
}
class C extends A{
    public void show(){
        System.out.println("In C");
    }
}
public class Hirachial_inheritence {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        obj1.show();
        obj2.show();
        
    }
}
