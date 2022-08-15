package homework.hw1;
public class AlperTunga {
    public static void main(String[] args) {
        for (int sayi = 2; sayi <= 1000;sayi++) {
			// for optimisation
            boolean asalMi = true;
            for (int bolen = 2; bolen < sayi; bolen++) {
                if (sayi % bolen == 0) {
                    asalMi = false;
					// donguden cikarsam gereksiz islem yapmayacagim
					bolen = sayi;
                }
            }
			System.out.println(sayi);
        	if (asalMi == true){
        	    System.out.println(sayi);
        	}
        }

    }
}
