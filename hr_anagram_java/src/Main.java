import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean isAnagram(String a, String b) {

        a.replaceAll("\\s","");
        b.replaceAll("\\s","");



        char[] arrStr1 = a.toLowerCase().toCharArray();
        char[] arrStr2 = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(arrStr1);
        java.util.Arrays.sort(arrStr2);

        boolean status = java.util.Arrays.equals(arrStr1, arrStr2);

        if(status) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");


    }
}
