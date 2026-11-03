import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[] num = new int[m];
             
            long sum = 0;       // 总和（用 long 防止溢出）
            long sumSq = 0;     // 平方和（用 long 防止溢出）
             
            for (int j = 0; j < m; j++) {
                num[j] = sc.nextInt();
                sum += num[j];                // 累加总和
                sumSq += (long) num[j] * num[j]; // 累加平方和（注意强转 long）
            }
             
            // 极差
            Arrays.sort(num); // 排序后求极差最方便
            int cha = num[num.length - 1] - num[0];
             
            // 方差
            double mean = (double) sum / m;           // 平均值
            double variance = (double) sumSq / m - mean * mean; // 方差公式
             
            // 处理浮点误差（防止出现极小的负数）
            if (variance < 0 && variance > -1e-9) {
                variance = 0;
            }
             
            // 输出：极差 和 方差（保留3位小数）
            System.out.printf("%d %.3f%n", cha, variance);
        }
         
        sc.close();
    }
}