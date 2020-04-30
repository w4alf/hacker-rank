import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.



        String[] arrOfStr = s.split("[A-Za-z !,?._'@]+");

        System.out.println(arrOfStr.length);

        for (String a : arrOfStr)
            System.out.println(a);




        scan.close();
    }


}
