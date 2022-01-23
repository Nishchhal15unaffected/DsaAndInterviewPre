import java.io.*;
import java.util.*;

public class Main {
    static String[] phone = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx",
                           "yz"
                          };
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        System.out.print(getKPC(str));
    }
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>rans=getKPC(ros);
        ArrayList<String> ans=new ArrayList<>();
        String phoneStr=phone[ch - '0'];
            for(int i=0;i<phoneStr.length();i++){
                char phoneCh=phoneStr.charAt(i);
                for(String item:rans){
                    ans.add(phoneCh+item);
                }
            }
        return ans;
    }

}