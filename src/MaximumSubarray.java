public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1,-3,4,-1,2,1,-5,4};
        int msum=maxSubArray(nums);
        System.out.println(msum);
    }
    static public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int curr_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i]+curr_sum){
                curr_sum=nums[i];
            }
            else{
                curr_sum+=nums[i];
            }
            if(curr_sum>max_sum){
                max_sum=curr_sum;
            }
        }
        return max_sum;
    }
}
