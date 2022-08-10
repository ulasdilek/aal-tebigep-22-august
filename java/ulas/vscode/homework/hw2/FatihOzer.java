package hw2;

import java.util.Scanner;

public class FatihOzer {
    public static String nickName;
    public static String password;
    public static Scanner scn=new Scanner(System.in);
    public static int count;
    public static void getInput(){
        System.out.println("Nick Name: ");
        nickName=scn.nextLine();
        System.out.println("Passaword: ");
        password = scn.nextLine();
        System.out.println("\n registration is complete... \n");

    }
    
    public static void main(String[] args) {
        getInput();
     
        while(true){ 
            System.out.println("Your Nick Name: ");
            String nickNameI=scn.nextLine();
            System.out.println("Your Passaword: ");
            String passawordI = scn.nextLine();
            if(nickName.equals(nickNameI)&& password.equals(passawordI)){
                System.out.println("You tried "+ String.valueOf(count)+" time");
                System.out.println("Welcome");
                break;
            }
            else{
                count++;
                System.out.print("Is you forget your password?");
                System.out.println("write Y to change Ä±nfo: ");
                String reply = scn.nextLine();
                if(reply.equals("Y")){
                    getInput();
                    
                }
                else{
                    System.out.println("try again");
                    continue;
                }
            }
        }
    
    }

}
