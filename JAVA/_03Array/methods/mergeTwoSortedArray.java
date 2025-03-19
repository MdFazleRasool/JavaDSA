package JAVA.Array.methods;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a ={1,5,7,9};
        int[] b = {2,6,8,10,11,23};
        int m=a.length;
        int n=b.length;
        int i=0,j=0,k=0;
        //int o=n+m;
        int[] c =new int[m+n];
        System.out.println("array a :-" );
        for (int ele :a)
            System.out.print( ele + " ");

        System.out.println("\narray b :-" );
        for (int ele :b)
            System.out.print(  ele + " ");
        System.out.println();
        //merging


        while (i<m && j<n){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
            }
            else {
                c[k]=b[j];
                j++;
            }
            k++;
            if(i==m){
                while(j<n) {
                    c[k]=b[j];
                    j++;
                    k++;
                }
            }
            if(j==n){
                while(i<m){
                    c[k]=a[i];
                    i++;
                    k++;
                }
            }
        }
        for (int ele :c)
            System.out.print( ele + " ");
    }
}
