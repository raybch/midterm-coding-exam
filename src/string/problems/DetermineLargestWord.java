package src.string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        for(Map.Entry m : wordNLength.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }

    public static Map<Integer, String> findTheLargestWord(String
                                                                  wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        //implement
        String [] words = wordGiven.split(" ");
        String longest_word = "";
        int longest_word_len = 0;
        for(int i= 0; i < words.length;i++){
            String word = words[i];
            int len = word.length();
            if(len > longest_word_len ){
                longest_word = word;
                longest_word_len = len;

            }
        }
        map.put(longest_word_len,longest_word);
        return map;
    }
}
