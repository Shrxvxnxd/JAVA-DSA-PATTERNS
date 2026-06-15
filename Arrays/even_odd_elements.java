import java.util.*;
// Even & Odd elements of array elements...
public class even_odd_elements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int even_count=0;
        int odd_count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.print(even_count);
        System.out.print(odd_count);
}
}