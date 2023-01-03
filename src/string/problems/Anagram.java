package src.string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:: ");
        String firstString = scanner.next();
        System.out.println("Enter second string:: ");
        String secondString = scanner.next();
        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();
        char[] charArrayFirstString = firstString.toCharArray();
        char[] charArraySecondString = secondString.toCharArray();

        Arrays.sort(charArrayFirstString);
        Arrays.sort(charArraySecondString);

        boolean isAnagram = Arrays.equals(charArrayFirstString, charArraySecondString);
        if (isAnagram) {
            System.out.println(firstString + " and " + secondString + " are anagram");
        } else {
            System.out.println(firstString + " and " + secondString + " are not anagram");
        }
    }

}




