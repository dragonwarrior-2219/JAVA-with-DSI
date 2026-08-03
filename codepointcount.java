import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "Hello";
        int count = s.codePointCount(0, s.length());
        System.out.println("Code Point Count = " + count);
    }
}
