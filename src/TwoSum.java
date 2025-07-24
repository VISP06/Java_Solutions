//This is the Brute Force solution for the infamous TwoSum problem

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, -4, 8, 11, 1, -1, 6, 2};
        int target=10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
