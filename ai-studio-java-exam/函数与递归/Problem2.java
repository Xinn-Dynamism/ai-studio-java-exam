import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int y=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
             
            int ycount=0;
            int tempY=y;
            while(tempY>0){
                if(tempY%10==x){
                    ycount++;
                }
                tempY=tempY/10;
            }
            int mcount=0;
            int tempM=m;
            if(m<=9 && x==0){
                mcount=1;
            }
            while(tempM>0){
                if(tempM%10==x){
                    mcount++;
                }
                tempM=tempM/10;
            }
            int dcount=0;
            int times=0;
            switch(m){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    times=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    times=30;
                    break;
                case 2:
                    if((y%4==0 && y%100!=0) || (y%400==0)){
                        times=29;
                    }else{
                        times=28;
                    }
                    break;
                default:{
                    times=0;
                }
            }
            if(x==0){
                dcount+=9;
            }
             
            for(int i=times;i>0;i--){
                int temp=i;
                while(temp>0){
                    if(temp%10==x){
                        dcount++;
                    }    
                    temp=temp/10;
                }
                  
            }
            int totalCount= times*(ycount+mcount)+dcount;
            System.out.println(totalCount);
        }
    }
     
}