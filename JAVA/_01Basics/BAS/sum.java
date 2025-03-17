package JAVA.Basics.BAS;

public class sum {
    public static void main(String[] args) {
        int[] arr={2,3,3,2,4,1};
        int n=arr.length;
        int sum =0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("the sum of array is :- "+  sum );
    }
}
