import java.util.Scanner;

public class nestedLoop
{
    public static void main(String[] args) {
        

        /* 
        int sira = 10;
        for (int i = 0; i < sira; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");   
            }
            System.out.println();
            
        }

        for (int i = 0; i < sira ; i++) {

            for (int j = 0; j <= (sira-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */




        /* 
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i*j));
            }
            System.out.println();
        }
        */

       
        /* 
        String a = "umut";
        String b = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatt";
        int counter = 0;
        //System.out.println(a.charAt(a.length()-1));

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if(a.charAt(i) == b.charAt(j))
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        */
        /* 
        for (int i = 5; 0<i ; i--) {
            for (int j = i; 0<j; j--) {
                System.out.print(j);
            }
            System.out.println();
            
        }
        */





















        System.out.println(is_odd(0));
        /* 
        Scanner in = new Scanner(System.in);
        System.out.println("bana bir kenarının uzunluğunu ver: ");
        double y = in.nextDouble();
        System.out.println("küpün hacmi: " + cubeVolume(y));
        */
        
        double test = power(3, 6);
        System.out.println(test);
        System.out.println(power(4, 5));

    }

    public static boolean is_odd(int number)
    {
        return number % 2 !=0;
    }

    public static double cubeVolume(double x)
    {
        return x*x*x;
    }
    public static double power(double base, double power)
    {
        double result = 1;
        for(int i = 0 ; i < power ; i++)
        {
            result = result*base;
        }
        return result;
    }
}