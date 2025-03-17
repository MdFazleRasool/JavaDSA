package JAVA.Basics.BAS;

import java.util.Scanner;

public class matrixMultiplication {
    public static  void print(int arr[][]){
        int m= arr.length, n=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[][] a =new int[3][3];
        int[][] b =new int[3][3];
        int[][] c=new int[3][3];

        int m= a.length, n=a[0].length;
        int x= b.length, y=b[0].length;
        Scanner sc = new Scanner(System.in);

        //taking input matrix a
        System.out.println("Enter matrix a :- " );
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]= sc.nextInt();
            }
        }

        //taking input matrix b
        System.out.println("Enter matrix b :- " );
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix a :- " );
        print(a);
        System.out.println("\n matrix b :- " );
        print(b);
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < x; k++) {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
            System.out.println();
        }
        print(c);
    }
}
