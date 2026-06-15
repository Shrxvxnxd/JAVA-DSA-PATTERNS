import java.util.*;

public class words_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s==null||s.trim().isEmpty()){
            System.out.println("Word Count: 0");
        } else {
            String[] k = s.trim().split("\\s+");
            System.out.print("Word Count: " + k.length);
        }

        
    }
}
