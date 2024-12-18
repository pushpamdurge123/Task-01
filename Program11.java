/*
 Q.11.Create a program to print all numbers from 1 to 20, skipping multiples of 3, using the continue statement.
 */



public class Program11 {

	public static void main(String[] args) {
		
		System.out.println("Numbers from 1 to 20, skipping multiples of 3:");

        for (int i = 1; i <= 20; i++) {
            
            if (i % 3 == 0) {
                continue; 
            }
            System.out.print(i + " ");
        }

	}

}
