package JAVA.Basics.conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a cost-price");
        int cp= sc.nextInt();
        System.out.println("enter a selling-price");
        int sp= sc.nextInt();
        if(sp>cp)
        {
            System.out.println("profit ="+(sp-cp));
        } else if (sp==cp) {
            System.out.println("no-profit-no-loss");

        }
        else {
            System.out.println("loss ="+(cp-sp));
        }
    }
}
