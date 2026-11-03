import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   
        while(sc.hasNext()){
             
         
           String s=sc.next();
            
         
            while(s.contains("ab")){
                s=s.replaceAll("ab","");
            }
            if(s.length()==0){
                System.out.println("Good");
            }
            else{
                System.out.println("Bad");
            }
             
        }
         
    }
}