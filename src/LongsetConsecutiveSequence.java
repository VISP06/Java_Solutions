import java.util.HashSet;
import java.util.Set;

public class LongsetConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 0, -1, 3, 2, 5, 5, 4, 3, 2, 9, 10, 11};
        System.out.println(longestConsecutive(nums));
    }
    static public int longestConsecutive(int[] nums) {
        int len=0;
        int longest=0;
        Set<Integer> numSet = new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        }
        for(int num:numSet){
            if(!numSet.contains(num-1)){
                while(numSet.contains(num+len)){
                    len++;
                }
            }
            longest=Math.max(longest, len);
        }
        return longest;
    }
}
