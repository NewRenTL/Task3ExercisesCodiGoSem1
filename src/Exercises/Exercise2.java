package Exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        System.out.print("Enter your sentence:");sentence = sc.nextLine();
        //System.out.print("\n");
        char searchChar;
        System.out.print("Enter your letter that you want search for:");
        searchChar = sc.next().charAt(0);
        //System.out.print("\n");
        System.out.print("How many letters '"+searchChar+"' are there in the sentence?: ");
        System.out.print(charExists(sentence,searchChar));
    }

    private static int charExists(String sentence,char charSearch)
    {
        int cont = 0;
        for (int i = 0; i < sentence.length();i++)
        {
            if(sentence.charAt(i) == charSearch)
            {
                cont++;
            }
        }
        return cont;
    }
}
