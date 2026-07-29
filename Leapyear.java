import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int x = scanner.nextInt();
        boolean y = x%4==0 && x%100!=0 || x %400 == 0;
        System.out.print(y? "Leap Year" : "Not a leap year");
        }
}
   
