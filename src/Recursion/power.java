package Recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(powe(2,10));
    }
    public static int powe(int n,int po){
        if (po == 0){
            return 1;
        }
        return n*powe(n, po-1);
    }
}
