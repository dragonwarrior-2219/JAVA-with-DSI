import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = scan.nextInt();
        System.out.println("Enter Second Number: ");
        int y = scan.nextInt();
        int hcf = hcf(x,y);
        int lcm = ((a*b)/hcf);
        System.out.println("LCM is" + lcm);
        System.out.println("HCF is" + hcf);
    }
}
