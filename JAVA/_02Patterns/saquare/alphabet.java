package JAVA.Patterns.saquare;
import java.util.Scanner;
public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               // System.out.print((char)(j+64 )+" ");

                //System.out.print((char) (j+96)+ " ");
                System.out.print((char)(i+64)+ " ");
            }
            System.out.println();


        }
    }
}
