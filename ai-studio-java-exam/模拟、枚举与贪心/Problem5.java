import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
         
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int bd = -1;
        StringBuffer sb = new StringBuffer();
        for(int a = 0; a < 10; a++){
            arr[a] = in.nextInt();
            if(arr[a] % 2 != 0){
                sum++;
                bd = a;
            }
            if(sum > 1){
                System.out.println(-1);
                return;
            }
        }
        int cnt = 0;
        for(int i = 1; i <= 9; i ++ ) {
            cnt += arr[i];
        }
        if(arr[0] != 1 && (cnt == 1 || cnt == 0)) {
            System.out.println(-1);
            return;
        }
        if(bd != -1) arr[bd]--;
        int i = 1;
        while(i < 10 && arr[i] == 0) i++;
            if(i >= 10){
//                 System.out.println(bd + arr[0]);
                if(bd == 0 && arr[0] == 0) System.out.println(0);
                else System.out.println(-1);
            }else{
                boolean flag = false;
                for(int a = 1; a < 10; a++){
                    if(arr[a] == 0) continue;
                    if(arr[0] != 0 && !flag) flag = true;
                    arr[a] -= 1;
                    sb.append(a);
                    if(arr[0] != 0 && flag) {
                        for(int m = 0; m < arr[0]/2; m++) sb.append('0');
                        arr[0] = 0;
                        flag = false;
                    }
                    for(int m = 0; m < arr[a]/2; m++) sb.append(a);
                }
                 
//                 for(int a = 9; a >= 0; a--){
//                     for(int m = 0; m < arr[a]/2; m++) sb.append(a);
//                 }
                String str = sb.toString();
                System.out.print(str);
                if(bd != -1) {
                    //sb.append(bd);
                    System.out.print(bd);
                }
                String result = "";
                for (int k = str.length() - 1; k >= 0; k--) {
                    result = result + str.charAt(k);
                }
                System.out.print(result);
//                 System.out.print(str);
        }
    }
}