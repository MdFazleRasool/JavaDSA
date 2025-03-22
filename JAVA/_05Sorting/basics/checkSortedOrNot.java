package JAVA.Sorting.basics;

public class checkSortedOrNot {
    public static void main(String[] args) {
        int[] arr ={1,7,8,9,14,12};
        int n=arr.length;
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                flag =true;
            }
        }
        if (!flag)
            System.out.println(" sorted");
        else
            System.out.println("unsorted");
    }
}
