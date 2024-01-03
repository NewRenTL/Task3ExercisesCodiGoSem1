package Exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence:");
        String sentence = sc.nextLine();
        Map<String,Integer> counterWords = new LinkedHashMap<>();

        String[] words = sentence.split("\\s+");
        //System.out.println(Arrays.toString(words));

        for(String word:words)
        {
            String normalizedWord = word.toLowerCase();

            counterWords.put(normalizedWord,counterWords.getOrDefault(normalizedWord,0)+1);
        }

        System.out.println("Word Count");
        for (Map.Entry<String,Integer> entry:counterWords.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }
}
