package Arrays.assignments;

public class Q1 {
    // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
    public static void main(String[] args) {
       // int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int nums[] = {1,2,3,4,5,6,7,8};
        System.out.println(check(nums));
    }
    public static boolean check(int nums[]){
        int cv = 0;
        for (int i = 0; i < nums.length; i++) {
            cv = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (cv == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }



}
