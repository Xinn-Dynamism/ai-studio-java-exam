public class Main {
    public static void main(String[] args) {
        for (int c = 1000; c <= 9999; c++) {        
            for (int a = 1; a <= 99; a++) {          
                if (c % a != 0) continue;            
                int b = c / a;
                if (a >= b) continue;                
                if (ok("" + a + b + c)) {
                    System.out.println(c + " = " + a + " x " + b);
                }
            }
        }
    }

    static boolean ok(String s) {
        if (s.length() != 9) return false;           
        boolean[] seen = new boolean[10];
        for (int i = 0; i < 9; i++) {
            int d = s.charAt(i) - '0';
            if (d == 0 || seen[d]) return false;  
            seen[d] = true;
        }
        return true;
    }
}