package src.string.problems;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String a, b = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        a = input.nextLine();

        int length = a.length();

        for ( int i = length - 1; i >= 0; i-- )
            b = b + a.charAt(i);

        if (a.equals(b)) {
            System.out.println(a+" is a palindrome");  }
        else {
            System.out.println(a+" is not a palindrome");  }

    }
    }


