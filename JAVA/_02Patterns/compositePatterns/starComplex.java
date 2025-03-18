package JAVA.Patterns.compositePatterns;

import java.util.Scanner;

public class starComplex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){ //rows

            for(int j=1;j<=n-i;j++){ //spaces
                System.out.print(" " +" " );
            }
            for(int j=1;j<=2*i-1;j++){ //number
                System.out.print("*" + " " );
            }
            for(int j=1;j<=n-i;j++){ //spaces
                System.out.print(" " +" " );
            }
            n--;
            for(int j=1;j<=2*i-1;j++){ //number
                System.out.print("*" + " " );
            }
            System.out.println();
        }
    }
}
