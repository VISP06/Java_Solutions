import java.util.Arrays;

public class NextGreaterElement_I {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 5, 2, 10};
        int[] nums2 = new int[]{4, 8, 2, 1, 5, 10, 9, 12};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
    static public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            boolean found = false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    found = true;
                }
                if(found && nums1[i]<nums2[j]){
                    ans[i]=nums2[j];
                    found = false;
                    break;
                }
            }
            if(found){
                ans[i]=-1;
            }
        }
        return ans;
    }
}
