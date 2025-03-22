package JAVA.Sorting.ADV;

public class quick_sort_algo {

    public static void swap (int []arr , int i , int j){

        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }

    public static void print (int arr[]) {
        for (int ele : arr) {
            System.out.println(ele + " ");
        }
    }

    public static void partition (int arr[], int low , int high ){
        int pivot = arr[low] , pivotidx = 0;

        int smallerCount = 0;
        for (int i =low+1 ; i<= high ; i++) {
            if (arr[i] <= pivot ) {
                smallerCount ++ ;
            }
        }

        int correctIdx = pivotidx + smallerCount ;
    }



    public static void main(String[] args) {

    }


}
