package Recursion;

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(TP(4));
    }

    public static int TP(int n){
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }
        //kaam
        //verticle choice
        int fnm1 = TP(n-1);
        //horizontal choice
        int fnm2 = TP(n-2);

        // total
        int totalways= fnm1+fnm2;
        return totalways;

    }
}
