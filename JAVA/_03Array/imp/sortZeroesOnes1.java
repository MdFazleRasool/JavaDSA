package JAVA.Array.imp;

import java.util.Arrays;

public class sortZeroesOnes1 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 0, 1, 1, 0, 1};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        int i, j;
        i = 0;
        j = n - 1;
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 0) {
                j++;
            }
            if (i > j) {
                break;
            }
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
