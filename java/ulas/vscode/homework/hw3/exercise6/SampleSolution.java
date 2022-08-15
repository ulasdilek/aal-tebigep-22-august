package homework.hw3.exercise6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a program that takes the length and the elements of an
 * array as input and sorts it, then changes the elements of a sub-array.
 * @author aaltebigep 
 */

public class SampleSolution {
	
	public static void main(String[] args) {
        System.out.print("Lütfen array boyutu giriniz: ");
        
        // 1
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];

        // 2
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        
        // 3
        System.out.println("Array: " + Arrays.toString(array));
        System.out.print("Elemanlar: ");
        for(int e : array)
        {
            System.out.print(e+", ");
        }
        System.out.println();
        
        // 4
        Arrays.sort(array);
        System.out.println("Sıralanmış array: " + Arrays.toString(array));

        // 5

        int[] arrayKopya = Arrays.copyOf(array, length);
        System.out.print("Lütfen başlangıç indexi giriniz:");
        int start = in.nextInt();
        while(start<0 || start>arrayKopya.length)
        {
            System.out.print("Lütfen geçerli bir başlangıç indexi giriniz:");
            start = in.nextInt();
        }
        
        
        System.out.print("Lütfen bitiş indexi giriniz:");
        int end = in.nextInt();
        while(end<0 || end>=arrayKopya.length || start>end)
        {
            System.out.print("Lütfen geçerli bir bitiş indexi giriniz:");
            end = in.nextInt();
        }
        
        

        System.out.print("Lütfen bir integer değer giriniz:");
        int val = in.nextInt();

        Arrays.fill(arrayKopya, start, end+1, val);

        System.out.println("Kopya ve değiştirilmiş array: " + Arrays.toString(arrayKopya));
        System.out.println("Orijinal array: " + Arrays.toString(array));
    }
	
}
