package Exercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nx1 = sc.nextInt();
        for (int i = 1; i<= nx1;i++)
        {
            for (int j = 0 ; j<i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
