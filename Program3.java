/*
Q.3.Write a program that takes an input score (0-100) and prints the grade using this
scale:
o 90-100: Grade A
o 80-89: Grade B
o 70-79: Grade C
o <70: Grade F 
*/

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the score (0-100): ");
		int score = scan.nextInt();
		
		if(score>=90 && score<=100 ) {
			System.out.println("Grade: A");
		}
		else if (score>=80 && score <=89) {
			System.out.println("Grade: B");
		}
		else if (score>=70 && score<=79) {
			System.out.println("Grade: C");
		}
		else if (score>=0 && score<70) {
			System.out.println("Grade: F");
		}
		else {
			System.out.println("Invalid score!!!");
		}

	}

}
