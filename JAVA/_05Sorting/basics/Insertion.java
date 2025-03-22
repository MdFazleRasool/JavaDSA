package JAVA.Sorting.basics;

public class Insertion {
    public static void print(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int arr[],int i,int k){
        int temp=arr[i];
        arr[i]=arr[k];
        arr[k]=temp;
    }

    public static void main(String[] args) {
        int[] arr ={10,12,-4,-5,6,2};
        int n=arr.length;
        print(arr,n);
        /*for (int i = 0; i < n ; i++) {
            for (int j = i; j >=1; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        print(arr,n);
        }*/
        /*for (int i = 0; i < n; i++) {
            int j=i;
            while (j>=1 && arr[j]<=arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        print(arr,n);
        }*/
        for (int i = 0; i < n ; i++) {
            for (int j = i; j >= 1 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
            }
        }
        print(arr,n);
    }
}

