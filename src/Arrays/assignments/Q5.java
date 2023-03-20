package Arrays.assignments;
import java.util.*;
public class Q5 {
    // i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
//        ans(nums);
        int[] res = three(nums);
        for (int i = 0; i < res.length; i += 3) {
            System.out.println(res[i] + ", " + res[i + 1] + ", " + res[i + 2]);
        }
    }

    private static int[] three(int[] nums) {
        Arrays.sort(nums); // Sort the input array
        int n = nums.length;
        int[] res = new int[n * n]; // Initialize result array
        int k = 0;
        for (int i = 0; i < n - 2; i++) { // Loop over sorted array
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res[k++] = nums[i];
                    res[k++] = nums[left];
                    res[k++] = nums[right];
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++; // Skip duplicates
                    while (left < right && nums[right] == nums[right + 1]) right--; // Skip duplicates
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return Arrays.copyOf(res, k);
    }
    }


