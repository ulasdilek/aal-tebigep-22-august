# Homework 5

Given a .txt file with words seperated by spaces, add all words to an ArrayList of Strings. Then, find out whether a word is a palindrome or not and print your findings.

## Definition
- Palindrome: A word, phrase, or sequence that reads the same backwards as forwards, *e.g. madam or nurses run*.
> For out purposes, we will only consider single words and we will not treat the lowercase and uppercase versions of the same letter as the same. *For instance, Racecar is not a palindrome since 'R' is not the same character as 'r'.*

## Requirements
1. Write a method that takes a `String` and returns whether it is a palindrome or not **iteratively**.
2. Write a method that takes a `String` and returns whether it is a palindrome or not **recursively**.
3. Read and add all words from the `input.txt` document with a `Scanner` object.
4. Remove and process the last element from the `ArrayList` with both of your methods until it is empty. Your output for each word should look something like this:

    ```
    ****************************************
    The word is: madam
         Is it a palindrome?
              Recursive answer: true
              Iterative answer: true
    ```

## Sources
- You will need to learn how to read a file with `Scanner`. To do that, we recommend going through the following sources:
    - [example with explanation](https://www.java67.com/2012/11/how-to-read-file-in-java-using-scanner-example.html)
    - [documentation for Scanner class](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Scanner.html)

- If you are stuck developing an algorithm to check whether a String is palindromic or not, go through this source that contains an explanation for a few ways to tackle this problem:
    - [help i'm stuck](https://www.educative.io/blog/algorithms-101-check-string-palindrome)