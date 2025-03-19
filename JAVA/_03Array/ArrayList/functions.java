package JAVA.Array.ArrayList;

import java.util.ArrayList;

public class functions {
    public static void main(String[] args) {
        ArrayList <Integer> a=new ArrayList<>();
        a.add(10);a.add(20);a.add(30);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(40);b.add(50);b.add(60);
        ArrayList<Integer> c=new ArrayList<>();

        ArrayList<Integer> d=new ArrayList<>();
        d.add(70);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        /*System.out.println(arr.get(1).get(0));
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }*/
        /*for (int i = 0; i < arr.size(); i++) {
            ArrayList_<Integer> x=arr.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }*/
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.print("\n");
        }
    }
}
