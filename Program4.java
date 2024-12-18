/*
Q.4.Write a program to take a day number (1 to 7) as input and display the day of the
week using a switch statement.
*/


import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a day Number (1 to 7): ");
		int weekdayNumber = scan.nextInt();
		
		switch (weekdayNumber) {
		
		case 1:System.out.println("Monday");
		break;
		
		case 2:System.out.println("Tuesday");
		break;
		
		case 3:System.out.println("Wednesday");
		break;
		
		case 4:System.out.println("Thursday");
		break;
		
		case 5:System.out.println("Friday");
		break;
		
		case 6:System.out.println("Saturday");
		break;
		
		case 7:System.out.println("Sunday");
		break;

		default:System.out.println("Invalid day number!!!");
		break;
		}

	}

}
