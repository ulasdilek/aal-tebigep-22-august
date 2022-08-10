package hw1;
public class HEren {

    public static void main (String[] args) {

        for(int asal=2;asal<=100;asal++) {
            int b = 0;
            for (int i = 2; i < asal; i++) {

                if (asal % i == 0) b =1 ;
            }
            if(b==0){
                System.out.print(asal +"  ");

            }
        }
    }
}
