// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int x =scanner.nextInt();
        if(x%4==0){
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is not a leap year"); 
            }
    }
}
        
