import java.util.*;
class Intdouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the user id");
        String userid = scan.next();
        System.out.println("Enter the Password");
        String password = scan.next();
        
        String memory = "dragon@gmail.com";
        String memorypass = "12345678";
        
        if (userid.equals(memory) && password.equals(memorypass)){
            System.out.println("Successfully logged in");
        }
        else{
            System.out.println("Invalid Access");
        }
        
        }
}
        
