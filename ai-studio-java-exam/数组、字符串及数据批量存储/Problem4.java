import java.util.Scanner;
public class Main{
    public static void main(String args []){
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int n=in.nextInt();
        int arr[][]=new int[n][2];
        int arr2[]=new int [l+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=arr[i][0];j<=arr[i][1];j++){
                int k=j;
                arr2[k]=1;
            }
        }
        int sum=0;
        for(int i=0;i<=l;i++){
            if(arr2[i]==0)
            sum++;
        }
        System.out.print(sum);
    }
      
    }