import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        // write ur code here
        int space=n/2;
        int star=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print('\t');
            }
            for(int j=0;j<star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if((n/2)>i){
                star=star+2;
                space--;
            }else{
                space++;
                star=star-2;
            }

        }
    }
}