package JAVA.Array.methods;

public class nextGreatestElement {
    public static void main(String[] args) {
        int[] arr={12,8,41,37,2,49,16,28,21};
        int n=arr.length;
        int [] ans = new int[n];
        ans[n-1]=-1;

        for(int ele :arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int i = 0; i < n-1; i++) {
            int large =Integer.MIN_VALUE;
            for (int j = i+1; j < n; j++) {
                large=Math.max(large,arr[j]);
//                if(arr[j]>large)
//                    large=arr[j];
            }
            ans[i]=large;
        }
        // minHeapImplementattion



        for(int ele :ans){
            System.out.print(ele + " ");
        }
    }
}
