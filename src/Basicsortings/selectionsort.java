package Basicsortings;

public class selectionsort {
    public static void main(String[] args) {
        int nums[] = {2,5,3,9,1,0,4};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int nums[]){
        for (int i = 0; i < nums.length - 1; i++) {
            int cv = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[cv] > nums[j]){
                    cv = j;
                }
            }//swap
            int temp = nums[cv];
            nums[cv] = nums[i];
            nums[i] = temp;
        }
    }
}
