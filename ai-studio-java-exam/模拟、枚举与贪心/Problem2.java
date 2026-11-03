import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
         
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int arr = 1;
            String str = in.next();
            int m[] = {0,0,0,0,0,0,0,0,0};
            int n[] = {1,2,1,3,0,3,1,2,1};
            int k[] = new int[str.length() + 10];
            for(int a = 0; a < str.length(); a++){
                 k[a] = str.charAt(a);
            }
            for(int a = 0; a < str.length() - 1; a++){
                int x = k[a] - '0';
                int y = k[a + 1] - '0';
                if(x == y){
                    arr = 0;
                    break;
                }
                if(m[x - 1] == 1||m[y - 1] == 1){
                    arr = 0;
                    break;
                }
                m[x - 1] = 1;
                if(n[x - 1] == n[y - 1]&&m[(x+y)/2 - 1] != m[x - 1]){
                    arr = 0;
                    break;
                }
            }
            if(arr == 0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}