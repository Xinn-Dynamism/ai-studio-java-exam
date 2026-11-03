import java.util.*;
import java.lang.StringBuilder;
public class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        StringBuilder s1=new StringBuilder();
        int n=sc.nextInt();
        int x=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            s1.append(i);
        }
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)-'0'==x)
                sum++;
        }
    System.out.print(sum);
}
}