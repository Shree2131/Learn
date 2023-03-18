package Functions;

public class factorial {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /*
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

     */

    //binomial coefficient
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = a-b;
        int d = (factorial(a)/(factorial(b)*factorial(c)));
        System.out.println(d);
    }
}
