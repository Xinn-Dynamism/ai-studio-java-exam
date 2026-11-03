import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String [] args) {
        BigInteger a,b,c;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i=0;i<n;i++) {
            a = in.nextBigInteger();
            b = in.nextBigInteger();
            c = a.multiply(b);
            System.out.println(c);
        }
    }
}