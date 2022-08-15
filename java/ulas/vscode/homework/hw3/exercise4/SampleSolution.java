package homework.hw3.exercise4;

import java.util.Scanner;

/**
 * This is a simple banking app
 * @author aaltebigep
 */

public class SampleSolution {

    public static void main(String[] args) {
        
        String PIN = "1234";
        double money = 1000;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter PIN:\t");
        if (in.next().equals(PIN)){
            System.out.println("1- Withdraw money\n2- Open a new account\n3- Change PIN\nSelect an operation:\t");
            int action = in.nextInt();
            if (action == 1){
                System.out.print("Enter the amount to withdraw:\t");
                double amount = in.nextDouble();
                money -= amount;
                System.out.printf("%s%.2f%s", "Your new balance is ", money, "TRY. Bye!");
            }
            else if (action == 2){
                System.out.println("1 - TRY\n2 - USD\nSelect currency type:\t");
                action = in.nextInt();
                if (action == 1) {
                    System.out.println("Your new TRY account is now opened! Bye!");
                }
                else if (action == 2) {
                    System.out.println("Your new USD account is now opened! Bye!");
                }
                else {
                    System.out.println("Invalid answer! Bye!");
                }
            }
            else if (action == 3){
                System.out.println("Enter your new PIN:\t");
                PIN = in.next();
                System.out.println("Your PIN is changed to " + PIN.charAt(0) + "**" + PIN.charAt(3) + ". Bye!");
            }
            else {
                System.out.println("Invalid answer! Bye!");
            }
        }
        else {
            System.out.println("Invalid PIN! Bye!");
        }
        
    }
    
}