package JAVA.Basics.BAS;
import java.util.Scanner;
public class Mxm2ndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n= sc.nextInt();

        int[] arr = new int [n];
        System.out.println("enter " +n + " elements in array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

    /*    int x=arr[0];
        int j=0;
        for (int i=0;i<n;i++){
            if(arr[i]>x){
                x=arr[i];
                j=i;
            }
        }
        arr[j]=0;
        x=arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>x){
                x=arr[i];
            }
        }

        System.out.println(" 2nd largest element is :" +x);  */
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
        }
        int smx=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]!=mx){
                smx=Math.max(smx,arr[i]);
            }
        }
        System.out.println("1st mxm " + mx);
        System.out.println("2nd mxm " + smx);
    }
}
