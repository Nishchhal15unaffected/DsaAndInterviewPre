import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int l=0;l<al.size();){
		    int val=al.get(l);
		    boolean flag=true;
		    for(int i=2;i*i<=val;i++){
		        if(val%i==0){
		            flag=false;
		        }
		    }
		    if(flag){
		        al.remove(l);
		    }else{
		        l++;
		    }
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}