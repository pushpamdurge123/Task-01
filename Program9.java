/*
Q.9.Print the following pattern using nested for loops:

*
* *
* * *
* * * *

 */


public class Program9 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
		}
	}

}
