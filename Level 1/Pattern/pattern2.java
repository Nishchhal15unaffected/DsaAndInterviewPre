import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        // write ur code here
        int star=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            star--;
        }

    }
}