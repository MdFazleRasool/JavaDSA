package JAVA.String.Builders;

public class stringBuilders {
    public static void main(String[] args) {
        /*String s=new String("fazle");
        System.out.println(s);*/
        StringBuilder sb=new StringBuilder("mfrasool");
        System.out.println(sb);
        System.out.println(sb.capacity());

        System.out.println(sb.length());
        StringBuilder x=new StringBuilder("");
        StringBuilder y=new StringBuilder();
        System.out.println(x);
        System.out.println(x.length());
        System.out.println(y);
        System.out.println(y.length());

        StringBuilder a=new StringBuilder(10);
        System.out.println(a.length());
        System.out.println(a.capacity());
        String s="abc";
        sb= new StringBuilder(s);
        System.out.println(sb.length());
        System.out.println(sb.capacity());




    }
}
