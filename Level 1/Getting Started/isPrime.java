import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        // write ur code here
       int t=scn.nextInt();
       int i=0;
       while(i<t){
           int n=scn.nextInt();
           boolean isPrime=true;
           for(int div=2;(div*div)<=n;div++){
               if(n%div==0){
                   isPrime=false;
                   break;
               }
           }
           if(isPrime){
               System.out.println("prime");
           }else{
               System.out.println("not prime");
           }
           i++;
       }
   }
  }