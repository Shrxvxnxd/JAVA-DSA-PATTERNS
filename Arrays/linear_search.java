import java.util.*;
//linear search of array elements
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==t){
                System.out.print(i);
                return;
            }
        
        }
        System.out.print(-1);
}
}