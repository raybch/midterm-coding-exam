package src.string.problems;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        List<String> list = new ArrayList<>();

        list.add("ABC");
        list.add("ACB");
        list.add("BAC");
        list.add("BCA");
        list.add("CAB");
        list.add("CBA");

        try {
            Assert.assertEquals(list, Permutation.allPermutation("ABC"));
        }catch(Exception ex){
            ex.getMessage();
        }

        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = new HashMap<>();
        wordNLength.put(10,"biological");

        try {
            Assert.assertEquals(wordNLength, DetermineLargestWord.findTheLargestWord(s));
        }catch(Exception ex){
            ex.getMessage();
        }


    }
}
