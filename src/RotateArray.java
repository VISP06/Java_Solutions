import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-5, -10, -15, -20};
        int k=1;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }
    static public int[] rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        return nums;
    }
    static void reverse(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;

        l++;
        r--;
    }
}
//this problem utilizes a simple 2 pointer approach
//we do k-1 and k because we need indices and not position itself
//to understand how this works:-
/*
1)Reverse the entire array
  after 1st function call:[7, 6, 5, 4, 3, 2, 1]
2)Reverse only the first k elements where k-1 will give the index of the last k element
  after 2nd function call:[5, 6, 7, 4, 3, 2, 1]
3)Reverse all the other elements after k (we just use k and not k+1 because that would be 3 and not 4 wrt this example)
  after 3rd function call:[5, 6, 7, 1, 2, 3, 4]
 */