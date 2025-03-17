package JAVA.Basics.conditionals;

import java.util.Scanner;

public class threeDigitNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        if(n>99 && n<1000)
        {
            System.out.println("3Digit-no");
        }
        else {
            System.out.println("Not a 3-Digit NO");
        }
    }
}
