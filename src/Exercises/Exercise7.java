package Exercises;

public class Exercise7 {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 10;i++)
        {
            System.out.println("Multiplication Table of number "+i);
            for (int j = 1 ; j <= 10;j++)
            {
                System.out.println(i + " x "+j+" = "+i*j);
            }
        }
    }
}
