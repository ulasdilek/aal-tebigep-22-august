package homework.hw4;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class SampleSolution {

	public static void main(String[] args) {
		
		String[] stringLib = {"aal", "tebigep", "anil", "arda", "ayberk", "baris", "bilge", "JAVA", "Python bad", "sahsenem", "su", "ulas", "umut"};
		Random rnd = new Random();
		int day = 1;
		ArrayList<String> entryUnit = new ArrayList<>();
		ArrayList<String> processingUnit = new ArrayList<>();
		ArrayList<Character> transportUnit = new ArrayList<>();

		// We initialize the entry unit to start our program
		for (int i = 0; i < 6; i++) {
			entryUnit.add(stringLib[rnd.nextInt(stringLib.length)]);
		}

		Scanner in = new Scanner(System.in);
		while (in.nextInt() == 1 && transportUnit.size() < 100) {

			if (day % 5 == 0) {
				for (int i = 0; i < 6; i++) {
					entryUnit.add(stringLib[rnd.nextInt(stringLib.length)]);
				}
			}
			
			String str = entryUnit.remove(rnd.nextInt(entryUnit.size()));
			// There is a more efficient way of doing this. You can check StringBuilder for more information
			String processed = "";
			int strLength = str.length();
			for (int i = 0; i < strLength; i++) {
				processed += str.charAt(strLength - i - 1);
			}
			processingUnit.add(processed);

			if (day % 7 == 0) {
				for (int i = 0; i < 7; i++) {
					transportUnit.add(processingUnit.get(i).charAt(0));
				}
			}

			System.out.println("Entry Unit: " + entryUnit);
			System.out.println("Processing Unit: " + processingUnit);
			System.out.println("Transport Unit: " + transportUnit);
			System.out.println();
			
			day++;

		}

		System.out.println("The factory is shut down on day " + day + ".");
		System.out.println("Entry Unit contains " + entryUnit.size() + " objects.");
		System.out.println("Processing Unit contains " + processingUnit.size() + " objects.");
		System.out.println("Transport Unit contains " + transportUnit.size() + " objects.");
		
	}
	
}