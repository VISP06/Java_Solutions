import java.util.Arrays;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 8, 15, 0, 0, 0};
        int[] nums2 = new int[]{5, 9, 12};
        int m=3;
        int n=3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }
    static public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        for(int i=nums1.length-1;i>m-1;i--){
            if(nums1[i]==0){
                nums1[i]=nums2[index];
                index++;
            }
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
//In this question we need to integrate nums2 into nums1 and that too in sorted order
//my approach is to find all zeroes and replace them the elemets from nums2
//this wouldn't work normally because the first element of nums1 can be zero
//but if we iterate from the back there will no issues
//after placing all the elements from nums2 to nums1 we just need to sort nums1