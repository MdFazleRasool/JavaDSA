package JAVA.Basics.BAS;

public class twoSum {

    public static void main(String[] args) {
        int arr[]={ 1,3,5,7,0,8,2,6};
        int x=8,i,j;
        int n= arr.length;
        for( i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if (arr[i]+arr[j]==x){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }

        }
    }
}
