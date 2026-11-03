import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = n * 2;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < m; j++)
                    System.out.print(" ");
                for (int k = 0; k <= i; k++)
                    System.out.print("*");
                m -= 2;
                System.out.println();
            }
            m = 2;
            for (int i = n; i > 0; i--) {
                for (int j = 0; j < m; j++)
                    System.out.print(" ");
                for (int k = 0; k < i; k++)
                    System.out.print("*");
                m += 2;
                System.out.println();
            }
        }
    }
}