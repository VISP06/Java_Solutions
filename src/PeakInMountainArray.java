public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 10, 5, 2, 1};
        System.out.println(peakIndexInMountainArray(nums));
    }
    static public int peakIndexInMountainArray(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[mid+1]){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}
