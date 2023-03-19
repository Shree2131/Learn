package Arrays;

public class kadansalgo {
    public static void main(String[] args) {
        int nums[] = {-2,-1,-3,4,-1,-2,2,6,-6};
         kadan(nums);
    }
    public static void kadan(int nums[]){
        int cv = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cv = cv+nums[i];
            if (cv <0){
                cv = 0;
            }ms= Math.max(cv,ms);
        }
        System.out.println("maximum sum of subarray is "+ ms);
    }
}
