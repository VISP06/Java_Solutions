public class PeakElement {
    public static void main(String[] args) {
        int[] mountainRange = new int[]{3, 4, 3, 2, 1, 5, 2};
        System.out.println(findPeakElement(mountainRange));
    }
    static public int findPeakElement(int[] nums) {
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
