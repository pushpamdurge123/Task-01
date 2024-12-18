/*
 Q.10.Write a program to search for a number in an array. If the number is found, print its index and terminate the loop using the break statement.
 */


import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        int[] numbers = {3, 8, 15, 23, 42, 7, 16};
        
        
        System.out.print("Enter a number to search for: ");
        int target = scan.nextInt();
        
        
        boolean found = false;

        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Number found at index: " + i);
                found = true;
                break; 
            }
        }
        
        
        if (!found) {
            System.out.println("Number not found in the array.");
        }

	}

}
