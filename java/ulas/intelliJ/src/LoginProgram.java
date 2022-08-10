import java.util.Scanner;

public class LoginProgram {

    public static void main (String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        // prompt the user if you want to get input
        String username = "yiitDelikan";
        String password = "yiit2004";

        int counter = 0;
        boolean inLoop = true;
        while (inLoop) {
            System.out.print("input username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("input password: ");
            String inputPassword = scanner.nextLine();

            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                inLoop = false;
                System.out.println("hosgeldin " + username + ". " + counter + " adet hatali deneme yaptiniz.");
            } else {
                System.out.println("beni kandiramazsin");
                ++counter;
            }
        }

    }

}
