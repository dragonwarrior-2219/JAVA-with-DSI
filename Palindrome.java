import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr = scan.next();
        String reverse = new StringBuilder(arr).reverse().toString();
        
        if (reverse.equals(arr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
