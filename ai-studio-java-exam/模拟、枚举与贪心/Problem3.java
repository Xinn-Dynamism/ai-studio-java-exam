import java.util.*;
import java.io.*;
public class Main {
    static BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
    static int st;
    static char[] c = new char[100010];
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            String str = s.nextLine();
            for(int i = 0; i < str.length(); i++) {
                c[st++] = str.charAt(i);
            }
            c[st++] = '\n';
        }
        for(int i = 0; i < st; i++) {
            if(c[i] == '"' && (i == 0 || c[i - 1] != '\\')) {
                i = get1(i + 1);
            } else if(c[i] == '/' && (i + 1 < st && c[i + 1] == '*')) {
                i = get2(i + 2);
            } else {
                log.write(c[i]);
            }
        }
        log.flush();
    }
     
    public static int get2(int i) throws Exception {
        String res = "/*";
        for(int j = i; j < st; j++) {
            res += c[j];
            if(c[j] == '*' && (j + 1 < st && c[j + 1] == '/')) {
                return j + 1;
            }
        }
        log.write(res);
        return st;
    }
     
    public static int get1(int i) throws Exception{
        log.write('"');
        for(int j = i; j < st; j++) {
            log.write(c[j]);
            if(c[j] == '"' && (j == 0 || c[j - 1] != '\\')) {
                return j;
            }
        }
        return 0;
    }
}