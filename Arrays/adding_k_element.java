import java.util.*;
// Adding k in each element of array
public class adding_k_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k=5;
       for(int i=0;i<n;i++){
            System.out.print(arr[i]+ k + " ");
       }
}
}