package homework.hw1;

public class Deniz {
	public static void main (String[] args){
		
		int a;
		for (int sayi=2; sayi <= 100; sayi += 1 ) {
			a = 0;
			for (int sayi2=2; sayi2 < sayi ; sayi2 += 1) { 
				if (sayi%sayi2 == 0) a += 1; 
			}
			if (a==0) {
				System.out.println(sayi);
			}
		}
   
	}

}