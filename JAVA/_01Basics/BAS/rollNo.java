package JAVA.Basics.BAS;

public class rollNo {
    public static void main(String[] args) {
        int[] arr={80,43,33,36,65,43,55,22,38,99,66,23};
        int n=arr.length;
        for (int i=0;i<n;i++){
            if(arr[i]<35)
                System.out.println(i + "");
        }
    }
}
