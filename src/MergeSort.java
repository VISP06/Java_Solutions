import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = new int[]{38, 27, 43, 3, 9, 82, -10, 50, 19, 65};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }
    static public int[] mergeSort(int[] nums){
        //we divide the array from the middle ofc
        int mid=nums.length/2;
        //when you take a closer look and divide the array till the end i.e till there is one
        //element remaining then we just need to return the array as that one element cannot be
        //divided further
        if(nums.length==1){
            return nums;
        }
        //we divide the array into 2 halves which are then sorted and combined into a new array
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0 ,mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    }
    static public int[] merge(int[] first, int[] second){
        int[] merged = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                merged[k]=first[i];
                i++;
                k++;
            }
            else{
                merged[k]=second[j];
                k++;
                j++;
            }
        }
        //sometimes one array will be bigger than the other so we need to add the remaining
        //elements to the merged array
        while(i<first.length){
            merged[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            merged[k]=second[j];
            j++;
            k++;
        }
        return merged;
    }
}
