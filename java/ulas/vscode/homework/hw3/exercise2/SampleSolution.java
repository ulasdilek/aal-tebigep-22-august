package homework.hw3.exercise2;

import java.util.Scanner;

/**
 * This is a program that takes inputs from the user to calculate their BMI.
 * @author aaltebigep
 */

public class SampleSolution {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your weight in kilograms:\t");
        double weight = Math.abs(in.nextDouble()); // Absolute value to prevent negative numbers
        System.out.print("Please enter your height in meters:\t");
        double height = Math.abs(in.nextDouble());
        double BMI = weight / (height * height);
        String status;

        //checking the conditions
        if (BMI >= 30) {
            status = "obese";
        }
        else if (BMI >= 25) {
            status = "overweight";
        }
        else if (BMI >= 18.5) {
            status = "healthy";
        }
        else {
            status = "underweight";
        }

		// To learn about formatted strings check these links (they all include different things):
		// http://www.java2s.com/Tutorials/Java/Java_Format/0080__Java_Format_Flags.htm
		// https://www.baeldung.com/java-printstream-printf
		// https://www.geeksforgeeks.org/java-string-format-method-with-examples/
        System.out.printf("%n%s%.2f%s%s%s%n", "Your BMI is ", BMI, " and you are ", status, ".");
        
    }
    
}