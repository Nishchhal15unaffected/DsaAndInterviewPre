import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int low=scn.nextInt();
        int high=scn.nextInt();
        for(;low<=high;low++){
            boolean isPrime=true;
            for(int div=2;(div*div)<=low;div++){
                if(low%div==0){
                    isPrime=false;
                   break;
                }
            }
            if(isPrime){
                   System.out.println(low);
            }
        }
    }
}