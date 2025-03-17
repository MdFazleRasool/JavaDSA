package JAVA.Basics.loops;

public class table {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number");
//        int n= sc.nextInt();
//        for (int i=1;i<=10;i++){
//            System.out.println(n*i);
        int x=4,y=0;
        while(x>=0){
            x--;
            y++;
            if(x==y)
                continue;
            else
                System.out.println(x+" "+y);
        }
    }
}
