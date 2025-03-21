package JAVA.String.Strings;

import java.util.Scanner;

public class indexAndCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter a JAVA.string :- ");
        String s= sc.nextLine();*/
        String s="fazle rasool";
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('f'));
        System.out.println(s.indexOf('z'));
        System.out.println(s.lastIndexOf('o'));
        System.out.println("\n \n ");


        String a= "abc";
        String b= "xyz";
        System.out.println(a.compareTo(b));
        a="abcd";
        b="xyz";
        System.out.println(b.compareTo(a));
    }
}
