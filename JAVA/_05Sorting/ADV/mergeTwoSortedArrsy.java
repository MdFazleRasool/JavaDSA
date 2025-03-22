package JAVA.Sorting.ADV;

public class mergeTwoSortedArrsy {
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
    public static void main(String[] args) {
        int []a={3,4,5,6,7,8};
        int []b={1,2,4,4,5,6,7,};
        int []c= new int [a.length+b.length];
        print(a);
        print(b);

        merge(a,b,c);
        print(c);
    }
}
