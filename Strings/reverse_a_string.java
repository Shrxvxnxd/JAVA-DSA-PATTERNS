import java.util.*;
public class reverse_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder k = new StringBuilder();
        
        for(int i=s.length()-1;i>=0;i--){
            k.append(s.charAt(i));
        }
        System.out.print(k.toString());
    }
}