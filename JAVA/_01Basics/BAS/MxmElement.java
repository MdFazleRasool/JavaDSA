package JAVA.Basics.BAS;

import java.util.Scanner;

public class MxmElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n= sc.nextInt();

        int[] arr = new int [n];
        System.out.println("enter " +n + " elements in array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int x=arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>x)
                x=arr[i];
        }
        System.out.println(" largest element is :" +x);
    }
}
