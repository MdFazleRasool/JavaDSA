package JAVA.Patterns.Triangle;

import java.util.Scanner;

public class alphabetNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if(i%2==0){
                    System.out.print((char) (j+64) + " ");
                }
                else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
