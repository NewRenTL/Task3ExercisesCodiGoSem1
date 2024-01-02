package Exercises;

import java.util.Scanner;
import  java.util.regex.Matcher;
import  java.util.regex.Pattern;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = null;
        while (!checkPassword(password))
        {

                System.out.println("Your password isn't secure");
                System.out.print("Enter your password:");
                password = sc.nextLine();
        }
        System.out.println("Your password is secure");
    }

    private static boolean checkPassword(String password)
    {
        if (password==null)
        {
            return false;
        }
        String regularExpression = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$";
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    };
}

