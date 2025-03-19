package JAVA.Array.imp;

import java.util.Arrays;

public class sortZeroOneTwo {
    public static void main(String[] args) {
        int arr[]={0,0,1,2,2,1,1,2,0,0,2,2};
        int n=arr.length;
        System.out.println(Arrays.toString(arr));
        int i,noz=0,noo=0,not=0;//noofzero,noofone,nooftwo
        for ( i=0;i<n;i++){
            if(arr[i]==0)
                noz++;
            else if (arr[i]==1)
                noo++;
        }
       // System.out.println(noo);

//        for (i=0;i<n;i++){
//            if (i<noz) arr[i]=0;
//            else if (i<noo+noz) arr[i]=1;
//            else arr[i]=2;
//        }
        for (i=noz;i<noo;i++)
            arr[i]=1;
        for (i=0;i<noz;i++)
            arr[i]=0;

        for (i=noo;i<n;i++)
            arr[i]=2;

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
