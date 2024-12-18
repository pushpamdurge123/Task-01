/*
Q.8.Create a program to repeatedly ask the user to enter a number and add it to a
sum. Stop when the user enters a negative number. Use a do-while loop.
 */

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        int sum = 0; 
        int number;  

        
        do {
            System.out.print("Enter a number (negative to stop): ");
            number = scan.nextInt();

            if (number >= 0) {
                sum += number; 
            }
        } while (number >= 0); 

        
        System.out.println("The total sum is: " + sum);

	}

}
