package src.string.problems;

import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        List<String> list = Arrays.asList(st.split(" "));
        Set<String> uniqueWords = new HashSet<String>(list);
        double sum=0;
        double sum1=0;
        double avg=0;
        for (String word :uniqueWords){
            if (Collections.frequency(list,word)>1) {
                int a=word.length();
                sum=sum+a;
                sum++;
                sum1=sum1+Collections.frequency(list,word);
                sum1++;
                avg=sum/sum1;

                System.out.println("The duplicate word is '"+word+"' and repeated "+ Collections.frequency(list,word)+" times");
            }
        }
        System.out.println("the average length of the words is :"+avg);;
        }
    }


