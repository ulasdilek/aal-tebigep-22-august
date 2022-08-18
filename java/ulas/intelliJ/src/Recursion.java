public class Recursion {
    static long fib(int n) {
        if (n <= 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int factorial(int n) {
        if ( n < 0) {
            return -1;
        }
        else if (0 == n || n == 1) {
            return 1;
        }
        return n*factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(-4));

    }
}
