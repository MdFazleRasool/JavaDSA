package JAVA.Array.imp;

public class reverseArray {
    public static void main(String[] args) {
        int arr []={ 1,3,5,7,8,9};
        int n= arr.length;
        for (int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        //for(i=0;i<n;i++)
        for (int i=0;i<n/2;i++){
            int j=n-i-1;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        for (int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
}
