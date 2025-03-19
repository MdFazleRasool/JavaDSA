package JAVA.Array.ArrayList;

import java.util.ArrayList;

public class Basics1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);

        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr.set(2, 99);//3rd element updated
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr.add(87);//pushed to last index


        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println(" size of array updated to " + arr.size());

        arr.remove(4);

        System.out.println(arr);
    }
}