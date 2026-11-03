import java.util.*;
 
public class Main{
     
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        String str = scan.next();
        while(t > 0){
            int i = str.indexOf('.');
            if(i == -1) break;
            while(i < n && str.charAt(i) < '5') i++;
            if(i >= n) break;
            str = str.substring(0, i);
            List<Character> list = new ArrayList<>();
            int k = 1;
            for(i = i - 1; i >= 0; i--){
                if(str.charAt(i) == '.'){
                    list.add('.');
                    continue;
                }
                list.add((char)(((Integer.valueOf(str.charAt(i) + "") + k) % 10) + '0'));
                k = (Integer.valueOf(str.charAt(i) + "") + k) / 10;
            }
            if(k > 0) list.add('1');
            StringBuffer sb = new StringBuffer();
            i = 0;
            while(i < list.size() && list.get(i) == '0') list.remove(i);
            if(list.get(0) == '.') list.remove(0);
            for(i = list.size() - 1; i >= 0; i--) sb.append(list.get(i));
            str = sb.toString();
            n = str.length();
            t--;
        }
         
        System.out.println(str);
    }
}