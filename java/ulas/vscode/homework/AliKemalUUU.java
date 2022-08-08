public class AliKemalUUU {
    public static void main(String[] args) {

        int x = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            int y = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    y = 1;
                    break;
                }
            }

            if(y==0)
            {
                System.out.print(sayi+"\n");
                x++;
            }
        }
    }
}
