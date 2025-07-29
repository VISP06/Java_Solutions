//this is a leetcode easy problem
public class LengthOfTheLastWord {
    public static void main(String[] args) {
        String sentence="  alpha   beta   gamma   delta   -  ";
        System.out.println(lengthOfLastWord(sentence));
    }
    static public int lengthOfLastWord(String s) {
        s=s.trim();
        int lastSpace=s.lastIndexOf(' ');
        String lastWord = s.substring(lastSpace+1);
        return lastWord.length();
    }
}
