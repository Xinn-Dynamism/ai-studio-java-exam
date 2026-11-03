import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       int m = sc.nextInt();
       int res = YSF(n,m);
       System.out.println((res + k) % n);
    }
 
    public static int YSF(int n, int m){
        if( n == 1)  return 0;
        return (YSF(n-1,m) + m) % n;
    }
}