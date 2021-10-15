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
    
    Dp(arr);
 }
 public static void Dp(int [][]arr){
     for(int k=0;k<arr[0].length;k++){
         for(int i=0,j=k;j<arr[0].length;j++,i++){
             System.out.println(arr[i][j]);
         }
     }
 }

}