import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long x = makePal(t);
        System.out.println(isPrime(x) ? "prime" : "noprime");
    }
    static long makePal(long t){
        long pal = t;
        long n = t / 10;
        while(n > 0){
            pal = pal * 10 + (n % 10);
            n /= 10;
        }
        return pal;
    }
     
    static boolean isPrime(long n){
        if(n < 2) return false;
        if(n % 2 == 0) return false;
        for(long i = 3; i * i <= n; i += 2){
            if(n % i == 0) return false;
        }
        return true;
    }
}