package hw1;
public class MEfe {

	public static void main(String[] args) {
        int num;
        for(int i=2; i<=100; i++){
            num=0;
            for(int x=2; x<=i/2; x++){
                if(i%x==0) num++;
            }
            if(num==0) System.out.println(+i);
        }
    }
}
