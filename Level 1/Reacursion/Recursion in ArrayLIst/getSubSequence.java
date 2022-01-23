import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        ArrayList<String> ans=gss(str);
        System.out.print(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>rstr=gss(ros);
        ArrayList<String>ans=new ArrayList<>();
        for(String word :rstr){
            ans.add(word);
        }
        for(String word :rstr){
            ans.add(ch+word);
        }
        return ans;
    }

}