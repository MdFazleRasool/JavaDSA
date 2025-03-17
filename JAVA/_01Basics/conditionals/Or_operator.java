package JAVA.Basics.conditionals;

import java.util.Scanner;

public class Or_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        if((n%5==0)||(n%3==0))
        {
            System.out.println("Divisible BY 3 or 5");

        }
        else
            System.out.println("Not divisible by 3 or 5");
    }
}
