package src;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        //Conditions to check if the number is negative or positive
        if (num > 0)
            System.out.println ("The number is positive");
        else if (num < 0)
            System.out.println ("The number is negative");
        else
            System.out.println ("Zero");
    }
}
