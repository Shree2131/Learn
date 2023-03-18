package Arrays;

public class largestnum {
    public static void main(String[] args) {
        int numbers[] = {3,6,2,4,0,7,8,5,1,9};
        int value = findlarge(numbers);

        System.out.println("largest number is "+ value);
    }
    public static int findlarge(int numbers[]){

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] >= max){
               max = numbers[i];
           }
        }return max;
    }
}
