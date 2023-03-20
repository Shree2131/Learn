package Basicsortings;

public class bubblesort {
    public static void main(String[] args) {
        int nums[] = {2,5,3,9,1,0,4};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();

    }
    public static void sort(int[] nums){
        int swap=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
        }
        System.out.println(swap);
    }
}
