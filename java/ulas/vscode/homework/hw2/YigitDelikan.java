package homework.hw2;

import java.util.Scanner;

class YigitDelikan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gotUsername = false;
        boolean gotPassword = false;
        boolean successfulLogin = false;
        boolean askForLoginRequest = true;
        int tries = 0;

        String username="";
        String password="";
        String loginUsername="";
        String loginPassword="";

        
        System.out.println("Yeni bir kullanıcı adı girin: ");
        while (!gotUsername) {
             username = sc.next();
             if (username.length()<5) {
                 System.out.println("Kullanıcı adınız 5 karakterden küçük olamaz.");
             }
             else {
                 gotUsername = true; 
             }
         }
        System.out.println("Yeni bir şifre girin: "); 
        while (!gotPassword) {
             password = sc.next();
             if (password.length()<8) {
                 System.out.println("Şifreniz 8 karakterden küçük olamaz.");
             }
             else {
                 gotPassword = true; 
             }
         }

         while(askForLoginRequest) {
             System.out.println("Kullanıcı adınız: "); 
             loginUsername = sc.next();
             System.out.println("Şifreniz: "); 
             loginPassword = sc.next();
             if(username.equals(loginUsername) && password.equals(loginPassword)) {
                 successfulLogin = true;
                 askForLoginRequest = false;
             }
             else if(tries < 5) {
                 System.out.println("Tekrar deneyiniz."); 
                 tries++;
             }
             
             else {
                 askForLoginRequest = false;
             }
         }

         if (successfulLogin) {
             System.out.println("Hoşgeldin, " + username + ". " + tries + " kere başarısız deneme.");
         }
         else {
             System.out.println("Deneme hakkınızı kaybettiniz. " + tries + " kere başarısız deneme." );

         }

     
         sc.close();
       
    }
}
