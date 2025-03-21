package JAVA.String.Builders;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s="fazle";
        /*char[] ch={'f','a','z','l','e'};
        int n= ch.length;
        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
        Arrays.sort(ch);
        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();*/

        /*char[] ch=s.toCharArray();
        int n= ch.length;
        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
        Arrays.sort(ch);
        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();*/
        StringBuilder sb=new StringBuilder("mfrasool");
        char[] arr=sb.toString().toCharArray();
        int m= arr.length;
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
