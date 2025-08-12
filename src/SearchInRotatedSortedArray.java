public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 1, 2, 3};
        int target = 3;
        System.out.println(search(arr, target));
    }
    static public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
//brute force solution for this problem is used here which is linear search