package JAVA.Patterns.compositePatterns;

import java.util.Scanner;

public class complex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();

        for (int i=1;i<=2*n-1;i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        n--;
        int nsp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*" +" " );
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("#" +" " );
            }
            nsp+=2;
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
