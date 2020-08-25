import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int numberOfStartingCharacters = s.length() - k + 1;
        for(int i=0; i<numberOfStartingCharacters; i++) {
            StringBuilder newSubstring = new StringBuilder();
            for(int j=0; j<k; j++) {
                newSubstring.append(s.charAt(i+j));
            }
            String string = newSubstring.toString();
            if(string.compareTo(smallest) < 0 || smallest.equals("")) {
                smallest = string;
            }
            if(string.compareTo(largest) > 0 ) {
                largest = string;
            }
        }
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