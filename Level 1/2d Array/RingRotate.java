import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]arr=new  int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int s=scn.nextInt();
        int r=scn.nextInt();
        ringRotate(arr,s,r);
    }

    public static void ringRotate(int [][]arr,int s,int r){
        int minr=s-1;
        int minc=s-1;
        int maxr=(arr.length)-s;
        int maxc=(arr[0].length)-s;
        int []oneD=fillOneDArray(minr,minc,maxr,maxc,arr);
        rotate(oneD,r);
        fillTwoDArray(minr,minc,maxr,maxc,oneD,arr);
        display(arr);
    }
    
    
    //fill one d array from 2d array 
    public static int[] fillOneDArray(int minr,int minc,int maxr,int maxc,int [][]arr){
        int vcount=(maxr-minr)+1;
        int hcount=(maxc-minc)+1;
        int size=(2*vcount+2*hcount)-4;
        int []oneD=new int[size];
        int count=0;
        while(count<size){
        //south:-> coln constant row variable 
        for(int i=minr;i<=maxr;i++){
            oneD[count]=arr[i][minc];
            count++;
        }
        minc++;
        //east :-> coln variable row constant
        for(int j=minc;j<=maxc;j++){
            oneD[count]=arr[maxr][j];
            count++;
        }
        maxr--;
        //north:-> coln constant row variable 
        for(int i=maxr;i>=minr;i--){
            oneD[count]=arr[i][maxc];
            count++;
        }
        maxc--;
        //west :-> coln variable row constant
        
        for(int j=maxc;j>=minc;j--){
            oneD[count]=arr[minr][j];
            count++;
        }
    }
        
        return oneD;
    }
    public static void rotate(int []oneD,int r){
        r=r%oneD.length;
        if(r<0){
            r=r+oneD.length;
        }
        //reverse rotate part
        reverse(oneD,0,((oneD.length)-r)-1);
        reverse(oneD,((oneD.length)-r),oneD.length-1);
        reverse(oneD,0,oneD.length-1);
    }
    public static void reverse(int []oneD,int i,int j){
        while(i<j){
            int temp=oneD[i];
            oneD[i]=oneD[j];
            oneD[j]=temp;
            i++;
            j--;
        }
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void fillTwoDArray(int minr, int minc,int maxr,int maxc,int[]oneD,int [][]arr){
         int count=0;
         int size=oneD.length;
        while(count<size){
        //south:-> coln constant row variable 
        for(int i=minr;i<=maxr;i++){
            arr[i][minc]=oneD[count];
            count++;
        }
        minc++;
        //east :-> coln variable row constant
        for(int j=minc;j<=maxc;j++){
            arr[maxr][j]=oneD[count];
            count++;
        }
        maxr--;
        //north:-> coln constant row variable 
        for(int i=maxr;i>=minr;i--){
            arr[i][maxc]=oneD[count];
            count++;
        }
        maxc--;
        //west :-> coln variable row constant
        
        for(int j=maxc;j>=minc;j--){
            arr[minr][j]=oneD[count];
            count++;
        }
    }
    }
}























import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]arr=new  int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int s=scn.nextInt();
        int r=scn.nextInt();
        ringRotate(arr,s,r);
    }

    public static void ringRotate(int [][]arr,int s,int r){
        int minr=s-1;
        int minc=s-1;
        int maxr=(arr.length)-s;
        int maxc=(arr[0].length)-s;
        int []oneD=fillOneDArray(minr,minc,maxr,maxc,arr);
        rotate(oneD,r);
        fillTwoDArray(minr,minc,maxr,maxc,oneD,arr);
        display(arr);
    }
    
    
    //fill one d array from 2d array 
    public static int[] fillOneDArray(int minr,int minc,int maxr,int maxc,int [][]arr){
        int vcount=(maxr-minr)+1;
        int hcount=(maxc-minc)+1;
        int size=(2*vcount+2*hcount)-4;
        int []oneD=new int[size];
        int count=0;
        while(count<size){
        //south:-> coln constant row variable 
        for(int i=minr;i<=maxr;i++){
            oneD[count]=arr[i][minc];
            count++;
        }
        minc++;
        //east :-> coln variable row constant
        for(int j=minc;j<=maxc;j++){
            oneD[count]=arr[maxr][j];
            count++;
        }
        maxr--;
        //north:-> coln constant row variable 
        for(int i=maxr;i>=minr;i--){
            oneD[count]=arr[i][maxc];
            count++;
        }
        maxc--;
        //west :-> coln variable row constant
        
        for(int j=maxc;j>=minc;j--){
            oneD[count]=arr[minr][j];
            count++;
        }
    }
        
        return oneD;
    }
    public static void rotate(int []oneD,int r){
        r=r%oneD.length;
        if(r<0){
            r=r+oneD.length;
        }
        //reverse rotate part
        reverse(oneD,0,((oneD.length)-r)-1);
        reverse(oneD,((oneD.length)-r),oneD.length-1);
        reverse(oneD,0,oneD.length-1);
    }
    public static void reverse(int []oneD,int i,int j){
        while(i<j){
            int temp=oneD[i];
            oneD[i]=oneD[j];
            oneD[j]=temp;
            i++;
            j--;
        }
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void fillTwoDArray(int minr, int minc,int maxr,int maxc,int[]oneD,int [][]arr){
         int count=0;
         int size=oneD.length;
        while(count<size){
        //south:-> coln constant row variable 
        for(int i=minr;i<=maxr;i++){
            arr[i][minc]=oneD[count];
            count++;
        }
        minc++;
        //east :-> coln variable row constant
        for(int j=minc;j<=maxc;j++){
            arr[maxr][j]=oneD[count];
            count++;
        }
        maxr--;
        //north:-> coln constant row variable 
        for(int i=maxr;i>=minr;i--){
            arr[i][maxc]=oneD[count];
            count++;
        }
        maxc--;
        //west :-> coln variable row constant
        
        for(int j=maxc;j>=minc;j--){
            arr[minr][j]=oneD[count];
            count++;
        }
    }
    }
}























