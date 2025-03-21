package JAVA.String.Builders;

public class equals {
    public static void main(String[] args) {
        String s="abcxyz";
        String a="abcxyz";
        String b=new String(s);
        String c="abc";
        c=c+"xyz";
        System.out.println(s==a);
        System.out.println(s==b);
        System.out.println(s==c);
        //equals to
        System.out.println(s.equals(b));
        System.out.println(s.equals(c));
        //compareto
        System.out.println(s.compareTo(a));//0 means same
    }
}
