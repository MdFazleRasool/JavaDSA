package JAVA.Basics.loops;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        int sum=0,remainder;
        while(n!=0)
        {
            remainder=n%10;
            sum=sum+remainder;
            n=n/10;

        }
        System.out.println("sum no of digits of a number is : " +sum);
    }
}

