//this is binary search but using recursion
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,2,4,6,8};
        int target=4;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        return binarysearch(nums, target, 0, nums.length-1);
    }
    static int binarysearch(int[] nums, int target, int l, int r){
            int mid=l+(r-l)/2;
            if(l>r){
                return -1;
            }
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                return binarysearch(nums, target, l, mid-1);
            }
            else{
                return binarysearch(nums, target, mid+1, r);
            }
    }
}
