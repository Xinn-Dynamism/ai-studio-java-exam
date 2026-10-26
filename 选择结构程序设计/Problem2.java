import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n<1 || n>10*10*10*10*10){
            n = scanner.nextInt();
        }
        if(n % 2 != 0){
            System.out.println(3 * n + 1);
        }else{
            System.out.println(n / 2);
        }
    }
}