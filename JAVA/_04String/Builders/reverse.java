package JAVA.String.Builders;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a JAVA.string:-");
        StringBuilder sb= new StringBuilder(sc.nextLine());
        int n=sb.length();

        int i=0,j=0;
        while (j<n){
            if(sb.charAt(j)!=' ')
                j++;
            else {
                reversed(sb,i,j-1);
                i=j+1;
                j=i;
            }
        }
        reversed(sb,i,j-1);
        System.out.println(sb);
    }
    public static void reversed(StringBuilder sb,int i, int j){
        while (i<=j){
            char temp= sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
