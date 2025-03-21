package JAVA.String.Builders;
import java.util.Scanner;
public class maxfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a JAVA.string ");
        String str=sc.nextLine();
        int [] freq  = new int[26];
        for (int i = 1; i <= freq.length; i++) {
            char ch = str.charAt(i);
            int idx =  (int) ch-97;
            freq[idx]++;

        }
        int maxfreq=-1;
        for (int i = 0; i < freq.length; i++) {
            maxfreq=Math.max(maxfreq,freq[i]);
        }
        for (int i = 0; i < freq.length; i++) {
            if(maxfreq==freq[i]){
                char ch= (char)(i+97);
                System.out.print(ch + " ");
            }
        }
    }
}
