//Write a program to check if a given number is positive, negative, or zero using an if-else statement.

import java.util.Scanner;

public class ifelseProgram {
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("Number is positive.");
		}
		
		else if (num<0) {
			System.out.println("Number is negative.");
		}
		
		else {
			System.out.println("Number entered is zero.");
		}

	}

}
