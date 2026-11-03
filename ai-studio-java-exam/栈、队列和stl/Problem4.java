import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
         
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        Arrays.sort(arr, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2))); 
        for(int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i]);
  
    }
}