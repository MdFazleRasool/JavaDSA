package JAVA.Basics.BAS;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n= sc.nextInt();

        int[] arr = new int [n];
        System.out.println("enter " +n + " elements in array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to search");
        int x= sc.nextInt();

        boolean flag =false;
        for (int i=0;i<n;i++){
            if(arr[i]==x){
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println(" element found");
        else
            System.out.println(" element not found");

    }
}
