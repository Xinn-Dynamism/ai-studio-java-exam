import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class TaskA {
 
        static void temp(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
 
        static void dfs(int[] arr){
            int left = 6;
            while(arr[left]>arr[left+1]){
                left--;
                if (left==-1){
                    break;
                }
            }
            if (left==-1){
                return;
            }
            int right = 7;
            while(arr[right]<arr[left]){
                right--;
            }
            temp(arr,left,right);
            int l = 7-left;
            for (int i = 0; i <l ; i++) {
                for (int j =left+1 ; j <7 ; j++) {
                    if(arr[j]>arr[j+1]){
                        temp(arr,j,j+1);
                    }
                }
            }
            for (int i = 0; i < 8; i++) {
                if(i==7){
                    System.out.println(arr[i]);
                }else{
                    System.out.print(arr[i]+" ");
                }
            }
 
        }
        public void solve(int testNumber, InputReader in, PrintWriter out) {
 
           int[] arr = {1,2,3,4,5,6,7,8};
           int sum =1;
            for (int i = 1; i <=8 ; i++) {
                sum*=i;
            }
            for (int i = 0; i < 8; i++) {
                if(i==7){
                    System.out.println(arr[i]);
                }else{
                    System.out.print(arr[i]+" ");
                }
            }
            for (int i = 0; i <sum ; i++) {
                dfs(arr);
            }
 
 
 
        }
    }
 
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    return false;
                    // TODO: handle exception
                }
            }
            return true;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public String nextLine() {
            String str = null;
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
        public double nextDouble() {
            return Double.parseDouble(next());
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
 
        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
 
        public BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
 
    }
}