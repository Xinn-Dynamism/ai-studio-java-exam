import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int m = (n + 1) / 2;
            for (int i = 1; i <= m * 2 - 1; i++) {
                int space = (Math.abs(n - 2 * i + 1)) / 2;
                int star = n - space * 2;
                for (int j = 0;j < space;j++)
                    System.out.print(" ");
                for (int j = 0;j < star;j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}