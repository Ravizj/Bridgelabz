package src;

import java.util.Scanner;

public class SunOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Positive Number");
        int num=scanner.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
