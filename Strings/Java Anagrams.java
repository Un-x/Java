import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        boolean value = true;
        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();
        if(!(ac.length==bc.length))
            return false;
        for(int i=0;i<ac.length-1; i++) {
            for(int j=i+1; j<ac.length; j++) {
                if(ac[i]>ac[j]) {
                    char temp = ac[i];
                    ac[i] = ac[j];
                    ac[j] = temp;
                }
                if(bc[i]>bc[j]) {
                    char temp = bc[i];
                    bc[i] = bc[j];
                    bc[j] = temp;
                }
            }
        }
        for(int i = 0; i<ac.length; i++) {
            if(!(ac[i]==bc[i])) {
                value=false;
                break;
            }
        }
        return value;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}