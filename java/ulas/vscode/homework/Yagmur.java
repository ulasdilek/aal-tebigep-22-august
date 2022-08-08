public class Yagmur {
    public static void main(String[] args)
    {
        int x;
        for(int i =2 ; i <= 100; i = i + 1)
        {
            x = 0;
            for (int j = 2; j <= i / 2  ; j = j + 1)
            {
                if (i % j == 0)
                {
                    x = x + 1;
                }
                if (x>=1)
                {
                    continue;
                }
            }
            if (x == 0)
            {
                System.out.println(i);
            }
        }
    }
}
