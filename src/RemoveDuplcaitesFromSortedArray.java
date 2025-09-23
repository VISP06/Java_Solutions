public class RemoveDuplcaitesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-3, -3, -1, 0, 0, 0, 2};
        System.out.println(removeDuplicates(nums));
    }
    static public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
