import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int m=scn.nextInt();
    int [][]arr=new int[n][m];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=scn.nextInt();
        }
    }
   spiralDisplay(arr,n,m);
 }
 public static void spiralDisplay(int [][]arr,int n,int m){
     int total=n*m;
     int count=0;
     int minr=0;
     int maxr=arr.length-1;
     int maxc=arr[0].length-1;
     int minc=0;
     while(count<total){
         for(int i=minr,j=minc;i<=maxr&&count<total;i++){ // south
                System.out.println(arr[i][j]);
                count++;
                
         }
         minc++;
         for(int j=minc,i=maxr;j<=maxc &&count<total;j++){ //easth
             System.out.println(arr[i][j]);
             count++;
         }
         maxr--;
         for(int i=maxr,j=maxc;i>=minr && count<total;i--){ //North
             System.out.println(arr[i][j]); 
             count++;
         }
         maxc--;
         for(int j=maxc,i=minr;j>=minc && count<total;j--){ //west
             System.out.println(arr[i][j]);
             count++;
         }
         minr++;
     }
 }

}