public class PrimitiveDataTypes {

    public static void main (String[] args)
    {

        boolean var1    = false;                // --> true or false
        byte    var2    = 127;                  // --> from -128 to 127
        char    var3    = 'a';                  // --> all characters in ASCII table
        short   var4    = 32767;                // --> from -32768 to 32767
        int     var5    = 2147483647;           // --> from -2147483648 to 2147483647
        float   var6    = 3.141592653589793238f;// --> floating point number with limited precision
        long    var7    = 9223372036854775807L; // --> from -9223372036854775808 to 9223372036854775807
        double  var8    = 3.1415926535897932384;// --> floating point number with higher precision

        long b = (long) 1073741824 * 536870912;
        System.out.println(b);

//        System.out.println(var1);
//        System.out.println(var2);
//        System.out.println(var3);
//        System.out.println(var4);
//        System.out.println(var5);
//        System.out.println(var6);
//        System.out.println(var7);
//        System.out.println(var8);

    }

}
