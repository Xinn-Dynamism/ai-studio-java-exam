import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().toUpperCase().charAt(0);
        int len=c-'A';
        for(int i=0;i<=len;i++) {
            for(int j=1;j<=len-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print((char)('A'+j));
            }
            for(int j=i-1;j>=0;j--) {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
 
}