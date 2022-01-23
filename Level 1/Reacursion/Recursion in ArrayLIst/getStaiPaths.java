import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.print(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
        ArrayList<String>ans= new ArrayList<>();
        ans.add("");
        return ans;
        }
        if(n<0){
        ArrayList<String>ans= new ArrayList<>();
            return ans; 
        }
        ArrayList<String>list1 =getStairPaths(n-1);
        ArrayList<String>list2= getStairPaths(n-2);
        ArrayList<String>list3= getStairPaths(n-3);
        ArrayList<String>ans= new ArrayList<>();
        for(String item:list1){
            ans.add("1"+item);
        }
        for(String item:list2){
            ans.add("2"+item);
        }
        
        for(String item:list3){
            ans.add("3"+item);
        }
        return ans;
    }

}