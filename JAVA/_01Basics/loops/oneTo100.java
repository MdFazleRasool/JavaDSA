package JAVA.Basics.loops;
import java.util.Scanner;
public class oneTo100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            if ((i%3 ==0)|| (i%5==0)){
                System.out.println(i);
            }
        }
    }
}
