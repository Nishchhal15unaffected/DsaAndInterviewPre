import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		String ans="";
		int i;
		for(i=0;i<str.length()-1;i++){
		    char a=str.charAt(i);
		    char b=str.charAt(i+1);
		    if(a!=b){
		        ans+=a;
		    }
		}
        char temp=str.charAt(i);
        ans+=temp;
		return ans;
	}

	public static String compression2(String str){
		// write your code here
	    String ans="";
	    int count=1;
	    int i;
		for(i=0;i<str.length()-1;i++){
		    char a=str.charAt(i);
		    char b=str.charAt(i+1);
		    if(a!=b){
		        ans+=a;
		        if(count>1){
		        ans+=count;
		        count=1;
		        }
		    }else{
		        count++;
		    }
		}
        char temp=str.charAt(i);
        ans+=temp;
        if(count>1)
        ans+=count;
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}