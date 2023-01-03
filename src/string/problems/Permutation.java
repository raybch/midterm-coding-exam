package src.string.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        System.out.println("Enter the string :");
        Scanner s = new Scanner(System.in);
        String a = s.next();
        ArrayList<String> answer = allPermutation(a);
        Collections.sort(answer);
        System.out.println(answer);   }
    public static ArrayList<String> allPermutation(String a) {
        if (a.length()==0){
            ArrayList<String> baseResult= new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char c = a.charAt(0);
        String rest = a.substring(1);
        ArrayList<String> recResult = allPermutation(rest);
        ArrayList<String> myResult = new ArrayList<>();
        for (int i = 0; i < recResult.size(); i++) {
            String s = recResult.get(i);
            for (int j = 0; j <= s.length(); j++) {
                String newString = s.substring(0, j) + c + s.substring(j);
                myResult.add(newString);
            }
        }
        return myResult;
    }
}
