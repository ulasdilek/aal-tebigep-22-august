package homework.hw3.exercise5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a program that takes the length and the elements of an
 * array as input and creates an prints a new array with the opposite order.
 * @author aaltebigep 
 */

public class SampleSolution {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Take the length of the array
        System.out.print("Input the length of the array: ");
		int length = in.nextInt();

		// Initialize the array and assign its elements by taking input
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Input element " + i +" of the array: ");
			arr[i] = in.nextInt();
		}
		in.close();

		// Initialize the inverse of the array and assign its elements with a for loop
		int[] inverse = new int[length];
		for (int i = 0; i < length; i++) {
			inverse[i] = arr[length - i - 1];
		}

		// Create the output String in the requested format
		String result = "[" + inverse[0];
		for (int i = 1; i < length; i++) {
			result += ", " + inverse[i];
		}
		result += "]";

		// Print the inverse array
		System.out.println(result);
        
    }
	
}
