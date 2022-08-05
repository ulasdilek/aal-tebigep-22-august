public class classjava{
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World\nHello World");
        System.out.printf("Hello %10s","World\n");

        // Data Types(primitive)
        byte b = 3;
        short x = 64;
        int y = 5324324;
        double d = 213.4234324;
        float f = 2.356f;
        
        System.out.println(b*x);
        System.out.println(x+y);
        System.out.println(x+d);
        System.out.println(d-y);
        System.out.println(f+d);

        System.out.println(5/10);
        System.out.println(5.0/10);
        System.out.println(5/10.0);

        System.out.println(123213%10);
        System.out.println(10*10);

        boolean control = true;
        boolean control2= false;

        //Non-primitive(to be continued),
            //Strings
        String text = "abcdefghjkl";
        String s = text.toUpperCase();
        String sRep = text.replace("a", "X");
        String sSub = s.substring(0,3);
        String sSub2 = s.substring(2,text.length());

        System.out.println(s);
        System.out.println(sRep);
        System.out.println(sSub);
        System.out.println(sSub2);


        //Math.
        double math_pow = Math.pow(10, 2);
        double min = Math.min(10.23, 10.3);
        double max = Math.max(10.23, 10.3);
        double sqrt = Math.sqrt(100.0);
        System.out.println(math_pow);
        System.out.println(min);
        System.out.println(max);
        System.out.println(sqrt);

        


    }
}