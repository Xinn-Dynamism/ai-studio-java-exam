import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n]; // 使用 long 防止加法溢出
 
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
 
        Arrays.sort(a);
 
        boolean found = false;
        for (int i = n - 1; i >= 2; i--) {
            // a[i-2] + a[i-1] > a[i] 是构成三角形的充要条件
            if (a[i - 2] + a[i - 1] > a[i]) {
                System.out.println(a[i - 2] + " " + a[i - 1] + " " + a[i]);
                found = true;
                break; 
            }
        }
 
        
        if (!found) {
            System.out.println("No solution");
        }
    }
}