import java.util.*;

public class Vowel_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int c=0;

        String L = s.toLowerCase();
        for(int i=0;i<L.length();i++){
            char ch = L.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                c++;
            }
        }
        System.out.print(c);
    }
}
