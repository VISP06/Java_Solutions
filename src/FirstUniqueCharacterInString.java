public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "abacabadefgh";
        System.out.println(firstUniqChar(s));
    }
    static public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            boolean isDuplicate = false;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                return i;
            }
        }
        return -1;
    }
}
//in this brute force method we iterate through the string and compare each letter with
//every letter except itself. if we duplicate is found then the control is shifted to the outer loop
//and the next letter is tested against all.
//after the inner loop each time it is checked whether the duplicate was found or not.
//if yes then as said before, next letter is tested. But if no, then the index i (letter that is test)
//is returned and if no such letter exists at all then -1 is returned