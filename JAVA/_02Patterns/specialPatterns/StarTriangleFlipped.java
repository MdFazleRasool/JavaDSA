package JAVA.Patterns.specialPatterns;

import java.util.Scanner;

public class StarTriangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if((j<=(n-i))){
                    System.out.print("0");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
