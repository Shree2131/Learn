package functions;

public class swap {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 30 ;
          new swap(a,b);
    }
    public swap(int a, int b){
         int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " +a);
        System.out.println("b = " + b);
    }
}
