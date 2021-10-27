import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();


        System.out.println(A.length() + B.length());

        System.out.println(A.compareTo(B));

        if(A.compareTo(B)>0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        };


        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+' '+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));


        //A.substring(2,A.length()) ;

    }
}
