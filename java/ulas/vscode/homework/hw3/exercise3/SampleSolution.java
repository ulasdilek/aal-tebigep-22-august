package homework.hw3.exercise3;

import java.util.Scanner;

/**
 * This is a program that makes computations on the user's input to determine if it is a leap year
 * according to the Gregorian calendar
 * @author aaltebigep
 */

public class SampleSolution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Oh no, I overslept! What year is it? \t");
        int year = in.nextInt();
        in.close();
        boolean isLeapYear;

        //divisible by 4?
        if ( year % 4 == 0){
            //divisible by 100?
            if ( year % 100 == 0){
                //divisible by 400?
                if ( year % 400 == 0){
                    isLeapYear = true;
                }
                else {
                    isLeapYear = false;
                }
            }
            else {
                isLeapYear = true;
            }
        }
        else{
            isLeapYear = false;
        }
        
        String leapYear = "not a leap year.";
        if (isLeapYear){
            leapYear = "a leap year.";
        }

        //minus 1 is for the inclusion of x00 years
        int century = (year - 1) / 100 + 1;
        String ordinal;
        //checking the last digit of the century
        if (century % 10 == 1 && century % 100 != 11){
            ordinal = "st";
        }
        else if (century % 10 == 2 && century % 100 != 12){
            ordinal = "nd";
        }
        else if (century % 10 == 3 && century % 100 != 13){
            ordinal = "rd";
        }
        else {
            ordinal = "th";
        }
        
		// To learn about formatted strings check these links (they all include different things):
		// http://www.java2s.com/Tutorials/Java/Java_Format/0080__Java_Format_Flags.htm
		// https://www.baeldung.com/java-printstream-printf
		// https://www.geeksforgeeks.org/java-string-format-method-with-examples/
        System.out.printf("%s%d%s%s%s%s%s", "So the year is ", year, " and we are in the ", century, ordinal, " century? That's ", leapYear);
        
    }
    
}