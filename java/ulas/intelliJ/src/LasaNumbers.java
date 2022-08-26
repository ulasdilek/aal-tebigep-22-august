import java.util.Scanner;

public class LasaNumbers {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Gimme a Lasa number:\t");
        int num = in.nextInt();
        if (isPrime(num)){
            int reverse = Integer.parseInt(reverseString(String.valueOf(num)));
            if (isPrime(reverse)) {
                System.out.println("Congrats! " + num + " and " + reverse + " are primes.");
            }
            else {
                System.out.println(num + " is prime but " + reverse + " is not.");
            }
        }
        else {
            System.out.println("Shame! " + num + " is not a prime number");
        }
    }
    static String reverseString(String str) {
        String reversed = "";
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            reversed += str.charAt(strLength - i - 1);
        }
        return reversed;
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < (int) Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
