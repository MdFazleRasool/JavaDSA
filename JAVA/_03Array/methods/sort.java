package JAVA._03Array.methods;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr ={30,330,20,90,54};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
