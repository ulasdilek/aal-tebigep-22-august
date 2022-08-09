import java.util.Scanner;

public class pzt_W2
{
    public static void main(String[] args) {
        
        /*
        
        //Example for .hasnext...

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a numbers : ");
        double largest = in.nextDouble();
        while (in.hasNextDouble()) {
            double input = in.nextDouble();
            if(input > largest)
            {
                largest = input;
            }  
        }
        System.out.println("The largest: " +largest);
        */


        /* 
        //Happy(umut) numbers example 1 2 3 4 5 6 7 8 9 153 370 371 407 1634 8208 9474
        //153 = Mat.pow(1,3) + Mat.pow(5,3) + Mat.pow(3,3)
        for(int i = 1 ; i<=10000 ; i++)
        {
            double sum = 0;
            //digit counter
            int number = i;
            
            int digitCounter = 0;
            
            while (number>0) {
                digitCounter++;
                number = number / 10;
            }
            number = i;
            while (number>0) {
                int digit = number % 10;
                sum = sum + Math.pow(digit, digitCounter);
                number = number / 10;
            }

            if(sum == i)
            {
                System.out.print(i + " ");
            }

        }
        */
        
        /* 
        //Nested loop example
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("i = " + i +" j= " + j +" ");
                //System.out.print("*");
            }
            System.out.println();
        }
        */
    }
}