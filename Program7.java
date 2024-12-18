/*
Q.7.Write a program to calculate the sum of digits of a number using a while loop.
 */

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        int number = scan.nextInt();

	        int sum = 0; 
	        int temp = Math.abs(number); 

	        
	        while (temp > 0) {
	            int digit = temp % 10; 
	            sum += digit;          
	            temp /= 10;           
	        }

	        
	        System.out.println("The sum of the digits is: " + sum);

	        

	}

}
