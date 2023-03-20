package Basicsortings;

public class insertionsort {
    public static void main(String[] args) {
        int nums[] = {2,5,3,9,1,0,4};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();

    }

    public static void sort(int nums[]){
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i-1;
            // finding the correct position to insert
            while (prev >= 0 && nums[prev]> curr){
                nums[prev+1] = nums[prev];
                prev--;
            }//insertion
            nums[prev+1] = curr;
        }
    }
}
