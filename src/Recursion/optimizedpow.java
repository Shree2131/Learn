package Recursion;

public class optimizedpow {
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
    public static int power(int n, int pow){
        if (pow == 0){
            return 1;
        }
        int hafpower = power(n , pow/2);
        int halfpowersq = hafpower*hafpower;
        if (pow %2 != 0){
             halfpowersq = n * halfpowersq;
        }
        return halfpowersq;

    }
}
