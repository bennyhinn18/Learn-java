import java.util.Scanner;

class Greatest {
    public static int findGreatest(int x, int y, int z) {
        return (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int greatest = findGreatest(a, y, z);
        System.out.println("The greatest number is " + greatest + ".");
    }
}