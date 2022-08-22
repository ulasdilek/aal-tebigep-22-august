package homework.hw5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SampleSolution{
    public static void main(String[] args) throws FileNotFoundException {
        final String PATH_TO_INPUT = "homework/hw5/"; // enter the directory path of the input file 
        
        Scanner file = new Scanner(new File(PATH_TO_INPUT + "input.txt"));
        ArrayList<String> wordList = new ArrayList<String>();
        while (file.hasNext()){
            String aWordFromTxt = file.next();
            wordList.add(aWordFromTxt);
        }
        System.out.println("Our word list is : " + wordList);
        
        while(!wordList.isEmpty())
        {
            String word = wordList.remove(wordList.size()-1);
            System.out.println("*".repeat(40));
            System.out.println("The word is: " + word );
            System.out.println(" ".repeat(5)  + "Is it a palindrome?");
            System.out.println(" ".repeat(10) + "Recursive answer: " + isPalindromeRec(word) );
            System.out.println(" ".repeat(10) +"Iterative answer: " + isPalindromeIte(word) );
            
        }
        
        

        
    }
    public static boolean isPalindromeRec(String word)
    {        
        if(word.length()<=1)
        {
            return true;
        }
        if(word.charAt(0) == word.charAt(word.length()-1))
        {
            return isPalindromeRec(word.substring(1, word.length()-1));
        }
        else
        {
            return false;
        }

    }
    public static boolean isPalindromeIte(String word)
    {
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) !=  word.charAt(word.length()-i-1))
            {
                return false;
            }
            
        }
        return true;
    }
}
