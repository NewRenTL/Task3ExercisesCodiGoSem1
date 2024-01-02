package Exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter an integer to list1:");
            int newint = sc.nextInt();
            list1.add(newint);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter an integer to list2:");
            int newint = sc.nextInt();
            list2.add(newint);
        }
        System.out.println("Content of List1: " + list1);
        System.out.println("Content of List2: " + list2);
        sc.nextLine();
        LinkedList<String> list3 = new LinkedList<>();
        for (int i = 0 ; i < 2;i++)
        {
            System.out.print("Enter an word to list3:");
            String n1 = sc.nextLine();
            list3.add(n1);
        }
        LinkedList<String> list4 = new LinkedList<>();
        for (int i = 0 ; i < 2;i++)
        {
            System.out.print("Enter an word to list4:");
            String n1 = sc.nextLine();
            list4.add(n1);
        }
        ArrayList<Integer> concatenatedList = new ArrayList<>();
        concatenatedList.addAll(list1);
        concatenatedList.addAll(list2);
        LinkedList<String> concatenatedList2 = new LinkedList<>();
        concatenatedList2.addAll(list3);
        concatenatedList2.addAll(list4);

        System.out.println("ListaConcatenated1: "+ concatenatedList);
        System.out.println("ListaConcatenated2: "+ concatenatedList2);



    }
}
