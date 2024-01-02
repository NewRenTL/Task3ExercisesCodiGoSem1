package Exercises;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        ArrayList<String> list1  = new ArrayList<>();
        for (int i = 0; i<3;i++)
        {
            System.out.print("Enter a word to list1:");
            String s1 = sc.nextLine();
            list1.add(s1);
        }
        System.out.println("List1 Original:" + list1);
        Collections.reverse(list1);
        System.out.println("List1 Reverse:"+ list1);

        LinkedList<String> list2 = new LinkedList<>();
        for (int i = 0; i < 3;i++)
        {
            System.out.print("Enter a word to list2:");
            String s1 = sc.nextLine();
            list2.add(s1);
        }
        System.out.println("List2 Original:" + list2);
        Collections.reverse(list2);
        System.out.println("List2 Reverse:"+ list2);
    }
}
