package homework.hw3.exercise1;

import java.util.Scanner;

/**
 * This program takes a String input from the user and does some operations on it
 * @author aaltebigep
 */

public class SampleSolution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the title: ");
        String input = in.nextLine();
        
        //print number of characters in the string
        System.out.println("Number of characters:" + input.length());

        //convert all characters to uppercase and print
        System.out.println("All uppercase:" + input.toUpperCase());

        //remove the leading and trailing whitespaces from the string and print
        System.out.println("Remove leading and trailing blank characters:" + input.strip()); // or .trim()

        //print the character at index 5
        System.out.println("Character at index position 5:" + input.charAt(5));

        //print the substring of title from 3rd character (inclusive) to 8th character (exclusive)
        System.out.println("Substring from 3rd character(inclusive) to 8th character(exclusive):" + input.substring(2, 7));

        //print the index of first occurence of character 'a'
        System.out.println("First occurence of character 'a':" + input.indexOf('a'));

        //print the index of last occurence of character 'a'
        System.out.println("Last occurence of character 'a':" + input.lastIndexOf('a'));
        
    }
    
}