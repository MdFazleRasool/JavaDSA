package JAVA.Sorting.basics;

public class selection {
    public static void print(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int arr[],int i,int mindx){
        int temp=arr[i];
        arr[i]=arr[mindx];
        arr[mindx]=temp;
    }

    public static void main(String[] args) {
        int[] arr ={10,12,-4,-5,6,2};
        int n=arr.length;
        print(arr,n);
        for (int i = 0; i < n - 1; i++) {
            int min= Integer.MAX_VALUE;
            int mindx=-1;
            for (int j = i; j < n; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            swap(arr,i,mindx);
        }
        print(arr,n);
    }
}
