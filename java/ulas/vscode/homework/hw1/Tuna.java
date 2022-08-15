package homework.hw1;
// https://www.reitix.com/merak/java-da-asal-sayilari-bulan-program/be15d670
public class Tuna {
    public static void main(String[] args) {

        int sayi;
        for (sayi= 2 ;sayi < 100; sayi=sayi+1) {
            int bolen;
            for(bolen=2;bolen<sayi;bolen=bolen+1){ //forda önce kontrol,sonra işlemi çalıştırır,3.yü yapar,tekrar kontroll yapar
                if (sayi%bolen==0) {
                    bolen=sayi+1; //gizli break çalışıyo ajan!!!!
                }
            }
            if (sayi==bolen){
                System.out.println(sayi);
            }



        }
    }
}
