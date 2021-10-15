import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int [][]arr=new int[n][n];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=scn.nextInt();
        }
    }
    saddlePrice(arr);
 }
 public static void saddlePrice(int [][]arr){
     for(int k=0;k<arr.length;k++){
         boolean s=true;
         int mini=arr[k][0];
         int col=0;
         for(int j=0;j<arr[0].length;j++){
             if(mini>arr[k][j]){
                 mini=arr[k][j];
                 col=j;
             }
         }
         for(int i=0;i<arr.length;i++){
             if(mini<arr[i][col]){
                 s=false;
                 break;
             }
         }
         if(s){
             System.out.println(mini);
             return;
         }
     }
     
     System.out.println("Invalid input");
 }

}