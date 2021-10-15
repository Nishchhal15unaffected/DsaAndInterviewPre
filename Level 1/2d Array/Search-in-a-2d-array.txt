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
    int x=scn.nextInt();
    search2d(arr,x);
 }
    public static void search2d(int [][]arr,int x){
        int i=0;
        int j=arr[0].length-1;
        while(true){
            if(arr[i][j]<x){
                i++;
                if(i==arr.length){
                    break;
                }
            }else if(arr[i][j]>x){
                j--;
                if(j<0){
                    break;
                }
            }else{
                System.out.println(i);
                System.out.println(j);
                return;
            }
        }
        System.out.println("Not Found");
    }
}