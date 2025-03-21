package JAVA.String.Builders;

import java.util.Scanner;

public class functionsAndInput {
    public static void main(String[] args) {
        StringBuilder ab= new StringBuilder("mfrasool");
        StringBuilder tb=new StringBuilder("fazle");
        System.out.println(ab.length());
        System.out.println(ab.capacity());
        System.out.println(ab.compareTo(tb));
        System.out.println(ab.reverse());

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a JAVA.string");
        /*String s= sc.nextLine();
        StringBuilder bb= new StringBuilder(s);*/
        StringBuilder sb=new StringBuilder(sc.nextLine());
        sb.setCharAt(1,'d');
        System.out.println(sb);

    }
}
