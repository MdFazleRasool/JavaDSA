package JAVA._03Array.methods;

public class mergeTwoSortedArrayReverse {
    public static void main(String[] args) {
        int[] a ={2,5,7,9};
        int[] b = {1,6,8,10,12,15,17};
        int m=a.length;
        int n=b.length;
        int i=m-1,j=n-1,k=m+n-1;
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


        while (i>=0&& j>=0){
            if(a[i]>=b[j]){
                c[k]=a[i];
                i--;
            }
            else {
                c[k]=b[j];
                j--;
            }
            k--;
            if(i==0){
                while(j>=0) {
                    c[k]=b[j];
                    j--;
                    k--;
                }
            }
            if(j==0){
                while(i>=0){
                    c[k]=a[i];
                    i--;
                    k--;
                }
            }
        }
        System.out.println("\n sorted array  :-" );
        for (int ele :c)
            System.out.print( ele + " ");
    }
}
