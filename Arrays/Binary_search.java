import java.util.*;
//Binary Search of array of elements...
public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int low = 0;
        int high = n - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == t) {
                System.out.println(mid);
                return;
            }
            else if(arr[mid] < t) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println(-1);
    }
}