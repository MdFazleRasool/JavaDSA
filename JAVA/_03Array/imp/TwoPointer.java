package JAVA.Array.imp;
public class TwoPointer {
    public static void main(String[] args) {
        int arr[]={ 1,2,3,4,5,6,7,8};
        int n= arr.length;
        for (int ele:arr){
            System.out.print(ele + " ");

        }
        System.out.println();
        int i=2,j=5;
        while (i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for (int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}


