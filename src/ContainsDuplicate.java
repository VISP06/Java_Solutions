import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{104729, 1299709, 15485863, 32452843, 49979687, 86028121, 1299709};
        System.out.println(containsDuplicate(nums));
    }
    static public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
