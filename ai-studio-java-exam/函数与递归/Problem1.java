import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count =0;
        char m ='2';
        for(int i=a;i<=b;i++){
           String s =String.valueOf(i);
                 for(int j=0;j<s.length();j++){
                     if(s.charAt(j)==m){
                     count++;
                     }
                 }
         }
            System.out.println(count);
    }
}