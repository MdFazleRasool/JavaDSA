package JAVA.Sorting.basics;

public class BubbleOptimized {
    public static void print(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int j){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,5,8,9,2,7,18,3};
        int n=arr.length;
        print(arr,n);
        //Bubble 1
        /*for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                swap(arr,j);
            }

        }
        print(arr,n);*/
        //Bubble 2   :--  slightly optimized
        /*for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                swap(arr,j);
            }
        }
        print(arr,n);*/


        //Sorting 3
        //optimized
        for (int i = 0; i < n - 1; i++) {
            boolean flag =true;
            for (int j = 0; j < n-1-i; j++) {
                //swap(arr,j);
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if (flag)
                break;
        }
        print(arr,n);
    }
}
