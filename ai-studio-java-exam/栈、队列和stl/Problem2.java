import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      long [] a = new long [n];
      long [] b = new long [n];
      long [] c = new long[n];
      long s=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextLong();
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextLong();
            c[i]=a[i]-b[i];
            s+=b[i];
        }
        Arrays.sort(c);
        long m=0;
        for(int i=n-1;i>=n-k;i--) m+=c[i];
        System.out.println(s+m);
    }