import java.util.*;

public class Palindrome_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder k = new StringBuilder(s);

        boolean isPalindrome = k.reverse().toString().equals(s);
        
        System.out.println(isPalindrome);
    }
}
