import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = 1;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.printf("%4d",start);
                start++;
            }
            System.out.println();
        }
    }
}