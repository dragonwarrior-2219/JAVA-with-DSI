import java.util.*;
class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        int x = ran.nextInt(100) + 1;
        System.out.println(x);
        boolean y = (x%2==0);
        System.out.println(y?"It is a Even Number" : "It is a Odd Number");
    }
}
