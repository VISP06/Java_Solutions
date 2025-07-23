import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s="listen";
        String t="silent";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        String s1=sortString(s);
        String t1=sortString(t);
        if(s1.equals(t1)){
            return true;
        }
        return false;
    }
    static public String sortString(String s){
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
