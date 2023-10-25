import java.util.Scanner;
class a{
    int a,b;
    Scanner sc = new Scanner(System.in);
    void in1(){
        System.out.print("Enter a numbers: ");
        a = sc.nextInt(); 
    }
}
class b extends a{
    void in2(){
        System.out.print("Enter a numbers: ");
        b = sc.nextInt(); 
    }
}
class c extends b{
    void add(){
        int sum = a + b;
        System.out.println("The sum is " + sum + ".");
    }
}
public class multi_level {
    public static void main(String args[]) {
        System.out.println("Multi-level inheritance");
        System.out.println("Program to add two numbers");
        c obj = new c();
        obj.in1();
        obj.in2();
        obj.add();
    }
}
