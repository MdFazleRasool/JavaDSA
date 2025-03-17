package JAVA.Basics.conditionals;

import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st side");
        int a= sc.nextInt();
        System.out.println("enter 2nd side");
        int b= sc.nextInt();
        System.out.println("enter 3rd side");
        int c= sc.nextInt();
        if ((a>=b) &&(a>=c))
            System.out.println("a is largest No of 3 numbers");
        else if ((b>=a) &&(b>=c))
            System.out.println("b is largest No of 3 numbers");
        else if ((c>=b) && (c>=a))
            System.out.println("c is largest No of 3 numbers");
    }
}
