/*
 Q.14.Write a program to print all Fibonacci numbers up to a given limit using a loop.
 */


import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

       
        System.out.print("Enter the limit up to which Fibonacci numbers should be printed: ");
        int limit = scan.nextInt();

        
        int first = 0, second = 1;

        System.out.println("Fibonacci numbers up to " + limit + ":");

        
        while (first <= limit) {
            System.out.print(first + " ");
            
            int next = first + second;
            first = second;
            second = next;
        }

	}

}
