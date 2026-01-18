import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Successful_Pairs_Of_Potion_Pairs {
    public static void main(String[] args) {
        int[] spells = {3, 1, 2};
        int[] potions = {8, 5, 8};
        long success = 16;
        int[] res = successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(res));
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        List<Integer> list = new ArrayList<>();
        for(int i =0 ; i<spells.length;i++){
            int num=potions.length;
            int l = 0;
            int r = potions.length-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                long combo = (long)spells[i]*potions[mid];
                if(combo>=success){
                    num=mid;
                    r=mid-1;
                }else if(combo<success){
                    l=mid+1;
                }
            }
            list.add(potions.length-num);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

