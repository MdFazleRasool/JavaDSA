package JAVA.Patterns.Triangle;

import java.util.Scanner;

public class starTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print( "* ");
//            }
//            System.out.println();
//        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) { // reverse triangle
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}