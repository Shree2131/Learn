package Recursion;

public class isSortedorNot {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        System.out.println(isSorted(num,0));
    }
    public static boolean isSorted(int[] num, int n){
        if (n == num.length-1){
            return true;
        }
        if (num[n]> num[n+1] ){
            return false;
        }
        return isSorted(num, n+1);
    }
}
