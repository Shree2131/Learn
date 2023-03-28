package Recursion.basics;

public class sumofNnumer {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
    public static int sum(int n ){
        if (n == 1){
            return 1;
        }
        int fm = sum(n-1);
        int ss = n+sum(n-1);
        return ss;
    }
}
