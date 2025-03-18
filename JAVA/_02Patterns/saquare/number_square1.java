package JAVA.Patterns.saquare;

import java.util.Scanner;

public class number_square1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((j+64 )+" ");
            }
            System.out.println();
        }
    }
}
