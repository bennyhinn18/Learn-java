import java.util.Scanner;
class Input{
    int a, y;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
         a = sc.nextInt();
         y = sc.nextInt();
    }
    
}
class Add extends Input{
    void add(){
        int sum = a + y;
        System.out.println("The sum is " + sum + ".");
    }
}
public class single_main {
    public static void main(String args[]) {
       Add obj = new Add();
         obj.input();
         obj.add(); 
    }
}
