package JAVA.Patterns.specialPatterns;

import java.util.Scanner;

public class sp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        int count =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }
    }
}
