/*
Q.6.Write a program to print the first 10 even numbers using a for loop.
 */

public class Program6 {

	public static void main(String[] args) {
		
		System.out.println("The first 10 even numbers are: ");
	
		for(int i=1; i<=10; i++) {
			int evenNumber = i*2;
			System.out.println(evenNumber);
		}

	}

}
