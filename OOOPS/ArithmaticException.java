import java.util.Scanner;
class ArithmaticException
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try
        {
            int c = a/b;
            System.out.println("Result = "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught : "+e);
        }
        System.out.println("End of program");
    }
}