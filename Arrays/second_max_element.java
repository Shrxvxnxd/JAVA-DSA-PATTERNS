import java.util.*;
// Second max element of array elements
public class second_max_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int max_2=0;
        for(int i=1;i<n;i++){
            if(arr[i]>max_2 && arr[i]!=max){
                max_2=arr[i];
            }
        }
        System.out.print(max_2);
}
}