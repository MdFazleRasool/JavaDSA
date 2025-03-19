package JAVA._03Array.methods;

public class shallowCopy {
    public static void main(String[] args) {
        int[] arr = {30, 330, 20, 90, 54};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        int[] nums = arr;
        System.out.println();
        nums[0] = 70;
        System.out.println(arr[0]);
        System.out.println(nums[0]);
    }
}