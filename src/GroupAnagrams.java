import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] input_words = new String[]{
                "listen","silent","enlist",
                "triangle","integral","altering",
                "dusty","study","student",
                "debitcard","badcredit",
                "night","thing",
                "evil","vile","veil","live",
                "pat","tap","apt",
                "dog","god","odg",
                "apple",
                "race","care","acre","cera"
        };
        System.out.println(groupAnagrams(input_words));
    }
    static public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
/*
Normally to find an anagram we just sort the 2 strings and compare em.
We do the same over here but with the help of a HashMap
1)Using an enhanced for loop we iterate through the array of strings to
sort each string
2)We then check whether the HashMap contains the word we just sorted
3)*If it does then we just use the key to place that element*
4)*If not then we have to create a new key using that new sorted word
 which will have an arraylist associated with it where all like word will be stored*
5)finally we return all values of the hashmap in an arraylist as per syntax
*/
