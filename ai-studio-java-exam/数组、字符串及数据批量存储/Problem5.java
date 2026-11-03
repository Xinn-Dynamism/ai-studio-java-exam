import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] moon = new int[n];
        for(int i=0;i<n;i++){
            moon[i] = sc.nextInt();
        }
         
        int last = moon[n-1]; 
         
        if(last == 0){
            System.out.println("UP");
        }
        else if(last == 15){
            System.out.println("DOWN");
        }
        else if(n == 1){
            System.out.println("-1");
        }
        else{
            int pre = moon[n-2];
            if(last > pre){
                System.out.println("UP");
            }else{
                System.out.println("DOWN");
            }
        }
    }
}