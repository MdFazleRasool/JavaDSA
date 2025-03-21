package JAVA.String.Builders;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abc");
        System.out.println(sb);
        sb.append(35);
        System.out.println(sb);
        sb.append('*');
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        char[] ch={'f','a','z','l','e'};
        sb.append(ch);
        System.out.println(sb);
        /*int[] arr={1,2,3,4,5};
        sb.append(arr);
        System.out.println(sb);*/
        StringBuilder tb=new StringBuilder("pqr");
        sb.append(tb);
        System.out.println(sb);
    }
}
