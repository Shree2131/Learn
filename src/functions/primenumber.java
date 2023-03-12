package functions;

public class primenumber {
    public static void main(String[] args) {
        int number = 9;
        boolean ans = isprime(number);
        if (ans == false){
            System.out.println(number +" is not a prime number.");
        } else {
            System.out.println(number+ " is a prime number. ");
        }
    }
    public static boolean isprime(int number){
        if (number == 1) {
            return true;
        }
        for (int i = 2; i < number-1; i++) {
            if (number% i == 0) {
                 return false;
            }
        }
        return true;
    }
}
