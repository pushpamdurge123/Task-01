/*
 Q.12.Write a program to calculate the average of elements in an array using an enhanced for loop.
 */



public class Program12 {

	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 40, 50};
        
        
        int sum = 0;
        
        
        for (int num : numbers) {
            sum += num;
        }
        
        
        double average = (double) sum / numbers.length;
        
        
        System.out.println("The average of the array elements is: " + average);

	}

}
