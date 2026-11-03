import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        int ans = 0;
 
        // 遍历 x 到 y 的每一个数
        for (long i = x; i <= y; i++) {
            if (check(i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
 
    // 判断：数位之和是否是 5 的倍数
    public static boolean check(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10;      
        }
        return sum % 5 == 0;
    }
}