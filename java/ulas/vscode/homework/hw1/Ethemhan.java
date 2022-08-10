package hw1;
public class Ethemhan {
    public static void main(String[] args) {

		for (int i  = 0;i<100;i=i+1 ){
		    if ((i==2) || (i==3) || (i==5) || (i==7))
		        System.out.println(i);
		    if ((i%2==0) || (i%3==0) || (i%5==0) || (i%7 == 0) ){
		        System.out.println("asal değilim");
		    }
		    else{
		        System.out.println(i);
			}
    	}
	}
}