package Arrays;

public class reversing {
    public static void main(String[] args) {
        int numbers[] = {0,1,2,3,4,5,6,7,8,9};
        rev(numbers);
        for (int i = 0; i <numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
    public static void rev(int numbers[]){
       int first = 0 , last = numbers.length-1;
        while (first < last){
            //swap
            int temp= numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }

    }
}
