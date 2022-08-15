package homework.hw1;
public class Yusuf {
    public static void main(String[] args) {

        for(int j = 2; j < 100; j++)
        {
            int i = 2;
            int timer = 0;

            while(i < j)
            {

                if(j % i == 0){
                    timer++;
                    // System.out.println("Not a Prime Number.");
                    i = j;
                }
                i++;
            }
            if(timer == 0)
            {
                System.out.println(i);
            }

        }
    

	}
}