// This pattern combines the concepts/logics used in previous few patterns.
// Print the diamond shaped star pattern ---> replace stars by 1 ---> print line numbers in the rows ---> 
// print increasing line numbers till n/2 (half), and then decreasing [1 to 3 then 2 to 1]
// print print increasing numbers in the columns ---> reccord the starting numbers of each line --->
// decrease the column numbers from half according to the first number
// ta-- daaa you got your pattern.

//     1
//   2 3 2
// 3 4 5 4 3
//   2 3 2
//     1

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int sp = n/2;
        int st = 1;
        int val = 1;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            int cval = val;
            
            for(int j=1; j<=st; j++){
                System.out.print(cval + "\t");
                
                if(j<=st/2){
                    cval++;
                }
                else{
                    cval--;
                }
                
            }
            
            if(i<=n/2){
                sp--;
                st+=2;
                val++;
            }
            else{
                sp++;
                st-=2;
                val--;
            }
            System.out.println();
        }

    }
}
