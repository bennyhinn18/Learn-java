import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.print("Enter a member as Month");
		Scanner sc =new Scanner(System.in);
		int month=sc.nextInt();
		switch (month){
		    case 1:{
		        System.out.print("January");
		    }
		    case 2:{
		        System.out.print("February");
		    }
		    case 3:{
		        System.out.print("March");
		    }
		    case 4:{
		        System.out.print("April");
		    }
		    case 5:{
		        System.out.print("May");
		    }
		    case 6:{
		        System.out.print("June");
		    }
		    case 7:{
		        System.out.print("July");
		    }
		    case 8:{
		        System.out.print("Augest");
		    }
		    case 9:{
		        System.out.print("September");
		    }
		    case 10:{
		        System.out.print("October");
		    }
		    case 11:{
		        System.out.print("November");
		    }
		    case 12:{
		        System.out.print("December");
		    }
		    default:{
		        System.out.print("Invalid Input");
		    }
		}
	}
}
