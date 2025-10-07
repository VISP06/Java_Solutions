import java.util.*;
public class ContainsDuplicate_II {
    public static void main(String[] args) {
        int[] nums = new int[]{1, -1, 5, -1, 2};
        int k=2;
        System.out.println(containsNearbyDuplicate(nums, k));
        //expected output:true
    }
    static public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(i-map.get(nums[i]))<=k){ //i is the index of dup element
                    return true;                     //map.get(nums[i]) is the latest addition of this element
                }
            }
            map.put(nums[i], i); //key is the number at index i & value is the index i
        }
        return false;
    }
}
