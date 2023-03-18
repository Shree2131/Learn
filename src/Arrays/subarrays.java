package Arrays;

public class subarrays {
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,9};
       subarr(nums);
    }
    public static void subarr(int nums[]){
      int sum = 0 , maxsum = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length-1; i++) {
            for (int j = 0; j <= nums.length-1; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k]+" ");
                    sum = sum +nums[k];
                }
                System.out.println(" sum = "+sum);
                if (maxsum < sum){
                    maxsum = sum;
                }
            }System.out.println();
        }
        System.out.println("maxsum = "+maxsum);
    }
}
