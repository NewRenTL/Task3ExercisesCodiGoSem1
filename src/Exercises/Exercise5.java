package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5;i++)
        {
            System.out.print("Enter a number to list1:");
            int nx1 = sc.nextInt();
            list1.add(nx1);
        }
        ArrayList<Integer> sub_array_list1 = new ArrayList<> (list1.subList(1,4));
        System.out.println("Sub Array 1 to 4-1: "+sub_array_list1);
        sc.nextLine();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < 5;i++)
        {
            System.out.print("Enter a string to list1:");
            String nx1 = sc.nextLine();
            list2.add(nx1);
        }
        ArrayList<String> sub_array_list2 = new ArrayList<> (list2.subList(1,4));
        System.out.println("Sub Array 1 to 4-1: "+sub_array_list2);
    }
}
