package JAVA.Basics.loops;
import java.util.Scanner;
public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        int a=-3;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            a=a*-4;
        }
    }
}
