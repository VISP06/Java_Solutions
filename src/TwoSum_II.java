//This is the solution to the problem TwoSum-II/TwoSum but array is sorted
//I have used the 2 pointers approach, thereby giving it a time complexity of 0(n)
import java.util.Arrays;

public class TwoSum_II {
    public static void main(String[] args) {
        int[] numbers = new int[]{-5, 1, 3, 8, 10, 19, 21, 30};
        int target=20;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    static public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                return new int[]{l+1, r+1};
            }
            else if(numbers[l]+numbers[r]>target){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[]{-1, -1};
    }
}
