//Q.2.Create a program to determine whether a given year is a leap year or not. Use nested if conditions.

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scan.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println(year + " is a leap year.");
				}
				else {
					System.out.println(year + " is not a leap year.");
				}
			}
			else {
				System.out.println(year + " is a leap year.");
			}
		}
		else {
			System.out.println(year + " is not a leap year.");
		}

	}

}
