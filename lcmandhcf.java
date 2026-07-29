import java.util.*;
public class Main {

    static int hcf(int a, int b) {
        if (b == 0)
            return a;
        return hcf(b, a % b);
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = scan.nextInt();
        System.out.println("Enter Second Number: ");
        int b = scan.nextInt();
        int hcf = hcf(a,b);
        int lcm = ((a*b)/hcf);
        System.out.println("LCM is" + lcm);
        System.out.println("HCF is" + hcf);
    }
}
