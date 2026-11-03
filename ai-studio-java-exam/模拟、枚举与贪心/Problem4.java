import java.util.*;
 
public class Main{
     
    static char[] zero = {'z', 'e', 'r', 'o'};
     
    static char[] two = {'t', 'w', 'o'};
     
    static char[] four = {'f', 'o', 'u', 'r'};
     
    static char[] six = {'s', 'i', 'x'};
     
    static char[] nine = {'n', 'i', 'n', 'e'};
     
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0){
            String str = scan.next();
            int n = str.length();
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < n; i++){
                char ch = str.charAt(i);
                if(ch == '0' || ch == '2' || ch == '4' || ch == '6' || ch == '9'){
                    sb.append(ch);
                    continue;
                }
                int idx = 0;
                if(ch == 'z'){
                    int j = i;
                    while(j < n && idx < 4 && str.charAt(j) == zero[idx]){
                        j++;
                        idx++;
                    }
                    if(idx >= 4) sb.append(0);
                }else if(ch == 't'){
                    int j = i;
                    while(j < n && idx < 3 && str.charAt(j) == two[idx]){
                        j++;
                        idx++;
                    }
                    if(idx >= 3) sb.append(2);
                }else if(ch == 'f'){
                    int j = i;
                    while(j < n && idx < 4 && str.charAt(j) == four[idx]){
                        j++;
                        idx++;
                    }
                    if(idx >= 4) sb.append(4);
                }else if(ch == 's'){
                    int j = i;
                    while(j < n && idx < 3 && str.charAt(j) == six[idx]){
                        j++;
                        idx++;
                    }
                    if(idx >= 3) sb.append(6);
                }else if(ch == 'n'){
                    int j = i;
                    while(j < n && idx < 4 && str.charAt(j) == nine[idx]){
                        j++;
                        idx++;
                    }
                    if(idx >= 4) sb.append(9);
                }
            }
            System.out.println(sb);
        }
        scan.close();
    }