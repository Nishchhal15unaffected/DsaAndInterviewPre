import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		//write your code here
		for(int i=0;i<str.length();i++){
		    for(int j=i;j<str.length();j++){
		        String sub=str.substring(i,j+1);
		        if(checkPalindrome(sub)){
		            for(int k=0;k<sub.length();k++){
		                char ch=sub.charAt(k);
		                System.out.print(ch);
		            }
		            System.out.println();
		        }
		    }
		}
	}
	public static boolean checkPalindrome(String sub){
	    int left=0;
	    int right=sub.length()-1;
	    boolean flag=true;
	    while(left<right){
	        
	        char a=sub.charAt(left);
	        char b=sub.charAt(right);
	        if(a!=b){
	           flag=false;
	           break;
	        }
	        left++;
	        right--;
	    }
	    return flag;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}