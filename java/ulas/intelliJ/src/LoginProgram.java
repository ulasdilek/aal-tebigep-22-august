import java.util.Scanner;

public class LoginProgram {

    public static void main (String[] args)
    {

        String username = "yiitDelikan";
        String password = "yiit2004";
        Scanner scanner = new Scanner(System.in);
        String inputUsername = scanner.nextLine();
        String inputPassword = scanner.nextLine();

        // sonraki ders .equals()
        if (username == inputUsername && password == inputPassword) {
            System.out.println("hosgeldin " + username);
        }
        else {
            System.out.println("beni kandiramazsin");
        }

    }

}
