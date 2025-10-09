public class FindTheHighestAltitude {
    public static void main(String[] args) {

    }
    static public int largestAltitude(int[] gain) {
        int max=0;
        int curr_res=0;
        for(int i=0;i<gain.length;i++){
            curr_res+=gain[i];
            if(curr_res>max){
                max=curr_res;
            }
        }
        return max;
    }
}
