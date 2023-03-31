package Recursion;

public class NthFibNum {
    public static void main(String[] args) {
        int num = 25;
        System.out.println(fib(num));
    }
    public static int fib(int num){
        if (num == 1 || num == 0){
            return num;
        }
        int fb1 = fib(num-1);
        int fb2 = fib(num-2);
        int fb = fb1+fb2;
        return fb;
    }
}
