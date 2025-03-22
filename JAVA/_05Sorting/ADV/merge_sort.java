package JAVA.Sorting.ADV;

public class merge_sort {
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void merge(int a[],int b[],int c[]){
        int i=0 , j=0 ,k=0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j])
                c[k++]=a[i++];
            else
                c[k++]=b[j++];

        }
        while (j<b.length)
            c[k++]=b[j++];
        while (i<a.length)
            c[k++]=a[i++];
    }
    public static void mergesort(int arr[]){
        int n = arr.length;
        if(n==1)
            return ;
        //creating 2 arrays of size n/2
        int a[] = new int[n/2];
        int b[] = new int[n-n/2];

        //copy pasting
        for (int i = 0; i < n/2; i++) {
            a[i]=arr[i];
        }
        //copy pasting
        //int m = n-n/2;
        for (int i = 0; i < n-n/2; i++) {
            b[i]=arr[i+n/2];
        }
        //magic
        mergesort(a);
        mergesort(b);

        //merge these a and b
        merge(a,b,arr);

        //delete a and b
        a=null;
        b=null;

    }
    public static void main(String[] args) {
        int []a={1,2,44,46,5,63,71,};
        print(a);
        mergesort(a);
        print(a);
    }
}
