package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {

    public static String largestWord(String word) {
        DetermineLargestWord determineLargestWord = new DetermineLargestWord();
        Map<Integer, String> length = determineLargestWord.findLargestWord(word);
        int i = 0;
        String Value = "";
        for (Map.Entry<Integer, String> checkLength : length.entrySet()) {
            if (i < checkLength.getKey()) {
                i = checkLength.getKey();
                Value = checkLength.getValue();
            }
        }
        return Value;
    }
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        System.out.println(largestWord(s));
    }

    public Map<Integer, String> findLargestWord(String word){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        String[] split = word.split(" ");

        for(int i=0;i<split.length;i++){
            map.put(split[i].length(),split[i]);
        }
        return map;
    }
}
