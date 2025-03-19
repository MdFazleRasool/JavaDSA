package JAVA._03Array.methods;

import java.util.Arrays;

public class deepCopy {
    public static void main(String[] args) {
        int[] arr = {30, 330, 20, 90, 54};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
//        int[] nums = arr;
//
//        nums[0] = 70;
//        System.out.println(arr[0]);
//        System.out.println(nums[0]);


        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] =320;
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("brr[0] = " + brr[0]);

        int[] crr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            crr[i]=arr[i];
        }
        crr[0]=47;

        System.out.println();
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("crr[0] = " + crr[0]);
    }
}
