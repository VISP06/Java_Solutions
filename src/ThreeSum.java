import java.util.*;

import static java.util.Arrays.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-4, -2, -2, -1, -1, 0, 1, 2, 2, 4, 4};
        System.out.println(threeSum(nums));
    }
    static public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();
        sort(nums);
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r) {
                if (nums[i] + nums[r] + nums[l] == 0) {
                    resultSet.add(Arrays.asList(nums[i], nums[r], nums[l]));
                    r--;
                    l++;
                } else if (nums[i] + nums[r] + nums[l] > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}
