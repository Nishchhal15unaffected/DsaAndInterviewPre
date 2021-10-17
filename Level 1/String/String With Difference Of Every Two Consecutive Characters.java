import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		StringBuilder sb=new StringBuilder();
		int n=str.length();
        for(int i=0;i<n;i++){
            if(i==n-1){
            char a=str.charAt(i);
		    sb.append(a);
            }else{
            char a=str.charAt(i);
            char b=str.charAt(i+1);
		    int ans=b-a;
		    sb.append(a);
		    sb.append(ans);
            }
        }
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}