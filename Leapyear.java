// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int x = scan.nextInt();
        int y = x%4==0 && x%100!=0 || x %400 == 0;
        y ? "Leap Year" : "Not a leap year";
        System.out.print(y);
        }
}
        
