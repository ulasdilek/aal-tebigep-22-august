package hw1;
public class YigitDelikan {
    public static void main(String[] args) {
        boolean isPrime;
        System.out.println("1. asal sayı: 2");
        int primeCount = 1;
        int[] primeArray = new int[100];
        primeArray[0] = 2;
        for(int i=3;i<101;i++) {
            isPrime = true;
            for(int j=0;j<primeCount && isPrime;j++){
                if(i%primeArray[j]==0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeArray[primeCount] = i; 
                primeCount++;
                System.out.println(primeCount + ". asal sayı: " + i);
            }
        }
        
    }
}
