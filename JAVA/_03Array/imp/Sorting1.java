package JAVA.Array.imp;

import java.util.Scanner;

class Sorting1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        // int m = arr.length, i;
        System.out.println("enter 10 elements in the array-");
        for (int i = 0; i < 10; i++) {
            // arr[i] = Integer.parseInt(br.readLine());
            arr[i]=sc.nextInt();
        }

        System.out.println("Array before sorting:-");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int x = 0, y = 10 - 1, temp;
        while (x < y) {
            temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }

        System.out.println("Array after sorting:-");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
