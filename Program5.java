/*
Q.5.Modify the above question to include an error message if the input is not
between 1 and 7.
 */

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day number (1 to 7): ");
		int weekdayNumber = scan.nextInt();
		
		if(weekdayNumber<1 || weekdayNumber>7) {
			System.out.println("Error: The input must be between 1 and 7.");
		}
		else {
			
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

}
