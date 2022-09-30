package src;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();


        //checking whether the number is even or odd
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is odd");

    }
}
