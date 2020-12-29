import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // only check just before the root of given number
        
        for(int div = 2; div*div<=n; div++){
            while(n%div == 0){
                n = n/div;
                System.out.print(div + " ");
            }
        }
        
        // for numbers which arelarge & prime
        // example 46 = 2*23
        // print the quotient instead of divisor
        
        if (n!=1){
            System.out.print(n);
        }
    }
}
