import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (m % n == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}