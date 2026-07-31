import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        int z = x * x + y * y;

        double hypotenuse = Math.sqrt(z);

        System.out.println("Hypotenuse = " + hypotenuse);

        sc.close();
    }
}
