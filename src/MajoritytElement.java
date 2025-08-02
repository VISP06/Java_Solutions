public class MajoritytElement {
    public static void main(String[] args) {
        int[] nums = new int[]{7, 7, 5, 7, 5, 1, 7};
        System.out.println(majorityElement(nums));
    }
    static public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                candidate=nums[i];
                count=1;
            }
        }
        return candidate;
    }
}

//this problem utilizes the boyer-moore algorithm