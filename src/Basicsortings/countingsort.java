package Basicsortings;

public class countingsort {
    public static void main(String[] args) {
        int nums[] = {2,5,3,9,1,0,4};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();

    }
    public static void sort(int nums[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max,nums[i]);
        }
        int count[] = new int[max+1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
