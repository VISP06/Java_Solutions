import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums=new int[]{8, 9, 9};
        System.out.println("Before->"+Arrays.toString(nums));
        System.out.println("After->"+Arrays.toString(plusOne(nums)));
    }
    static public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        //we make room for the carry that will be added to the array
        int[] numbers = new int[n+1];
        numbers[0]=1;
        return numbers;
    }
}
