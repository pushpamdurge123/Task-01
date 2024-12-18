/*
 Q.15.Create a menu-driven program that lets the user:
o
Enter 1 to check if a number is odd or even.
o
Enter 2 to find the factorial of a number.
o
Enter 3 to exit the program. Use a switch statement and a loop to handle the menu.
 */


import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println("\nMenu:");
            System.out.println("1. Check if a number is odd or even");
            System.out.println("2. Find the factorial of a number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " is even.");
                    } else {
                        System.out.println(number + " is odd.");
                    }
                    break;

                case 2: 
                    System.out.print("Enter a number to find its factorial: ");
                    int num = scanner.nextInt();
                    if (num < 0) {
                        System.out.println("Factorial is not defined for negative numbers.");
                    } else {
                        long factorial = 1;
                        for (int i = 1; i <= num; i++) {
                            factorial *= i;
                        }
                        System.out.println("The factorial of " + num + " is: " + factorial);
                    }
                    break;

                case 3: 
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default: 
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3); 

	}

}
