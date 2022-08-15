import java.util.Arrays;
import java.util.Scanner;

public class OurArrays {

    public static void main (String[] args)
    {
        /*
        // we can assign the elements inside the array in the declaration
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(intArray[0]);

        // we can also create an array with a fixed size and default values as elements
        String[] stringArray = new String[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < stringArray.length; i++){
            System.out.print("element " + i + " of the array: ");
            stringArray[i] = scanner.next();
        }
        System.out.println(Arrays.toString(stringArray));
        */

        String[] telefonDolabi = new String[35];
        for (int i = 0; i < telefonDolabi.length; i++){
            System.out.println("element " + i + " of telefonDolabi: " + telefonDolabi[i]);
        }


    }

}
