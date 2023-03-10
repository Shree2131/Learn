package Loops;

public class alphahp {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';

        for (int line = 1; line <= n; line++) {
            for (int cha = 1; cha <= line; cha++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
