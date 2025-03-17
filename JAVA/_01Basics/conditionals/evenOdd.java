package JAVA.Basics.conditionals;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        if(n%2 ==0)
            System.out.println("Even");
        if(n%2 != 0)
            System.out.println("odd");



    }
}
