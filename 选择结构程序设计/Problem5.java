import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = scanner.nextLong();
        if(m%n==0) 
            System.out.println(m + n);
        else if(m%n!=0)
            System.out.println(n-m);
    }
}