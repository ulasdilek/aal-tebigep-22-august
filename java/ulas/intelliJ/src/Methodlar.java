public class Methodlar {
    public static void main (String[] args)
    {
        int toplam1 = topla(5, 8);
        int toplam2 = topla(1, -1);
        System.out.println(toplam1);
        System.out.println(toplam2);
    }
    static int topla(int x, int y) {
        int z = x + y;
        return z;
    }
}
