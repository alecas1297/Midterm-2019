package string.problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        List<String> list = Arrays.asList(st.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));


        }
        System.out.println(getWordLengths(st));
    }
    public static ArrayList<Integer> getWordLengths( String str1 )
    {

        String str = " " + str1 + " ";

        ArrayList<Integer> list = new ArrayList<Integer>();

        for ( int i = 0; i < str.length(); i++ )
        {
            if ( str.charAt(i) == ' ' )
            {
                for ( int j = i+1; j < str.length() ; j++)
                {
                    if ( str.charAt(j) == ' ')
                    {
                        list.add( j - i - 1 );
                        j = str.length();
                    }
                }
            }
        }
        return list;
    }
}


