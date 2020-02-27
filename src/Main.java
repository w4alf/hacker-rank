import java.util.Scanner;

public class Main {

       public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";


           for(int i = 0;i<=s.length()-k;i++){

               String subStr = s.substring(i,i+k);

               if(i == 0){
                   smallest = subStr;
               }
               if(subStr.compareTo(largest)>0){
                   largest = subStr;

               }else if(subStr.compareTo(smallest)<0)
                   smallest = subStr;
           }


            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            return smallest + "\n" + largest;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
    }

