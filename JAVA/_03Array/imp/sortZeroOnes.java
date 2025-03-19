package JAVA.Array.imp;

public class sortZeroOnes {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,0,0,1,1,0,1};
        int n=arr.length;
        int i,j;
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        i=0;
        j=n-1;
//        while(i<j){
//            if (arr[i]==0){
//                i++;
//            }
//            else if (arr[j]==1) {
//                j--;
//            }
//            else if (arr[i]==1 && arr[j]==0) {
//                arr[i]=0;
//                arr[j]=1;
//                i++;
//                j--;
//           }
//        }
//        System.out.println(arr);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int noOfZeroes=0;
        int noOfOnes=0;
        for (i=0;i<n;i++){
            if(arr[i]==0){
                noOfZeroes++;
            }
            if(arr[i]==1){
                noOfOnes++;
            }
        }
        for (i=0;i<noOfZeroes;i++){
            arr[i]=0;
        }
        for (i=noOfZeroes;i<n;i++){
            arr[i]=1;
        }
        System.out.println(arr);
    }
}
