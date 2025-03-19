package JAVA.Array.imp;

public class reverseTwoPointer {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 7, 8, 9};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int i=0,  j=n-1;
        while(i<=j){
            int temp= arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        for ( i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
