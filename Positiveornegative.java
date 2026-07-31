import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        if(x >0){
            System.out.println(x + " is a Positive Number");
        }
        else if(x < 0 ){
            System.out.println(x + " is a negative nummber");
        }
        else {
            System.out.println("It is a Positive number");
        }

    }
}
