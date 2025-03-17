package JAVA.Basics.loops;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.println("total no of digits are : " +count);
    }
}
