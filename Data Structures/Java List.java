import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List <Integer> L = new ArrayList <Integer>();
        for (int i = 0; i < n; i++) {
            L.add(scan.nextInt());
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String operation = scan.next();
            if (operation.equalsIgnoreCase("Insert")){
                int index = scan.nextInt();
                int item = scan.nextInt();
                L.add(index, item);
            }
            else{
                L.remove(scan.nextInt());
            }
        }
        for (Integer integer : L){
            System.out.print(integer + " ");        
        }
        scan.close();
    }
}
