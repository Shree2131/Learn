package Arrays;

public class LinearSrch {
    public static void main(String[] args) {
        int numbers[] = {3,6,2,4,0,7,8,5,1,9};
        int key = 8;

        int index = LinearSearch(numbers ,key);
        if (index == -1){
            System.out.println("number not found");
        }else System.out.println("number found at index " + index);

    }
    public static int LinearSearch(int numbers[],int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
}
