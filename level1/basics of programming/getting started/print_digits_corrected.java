// I replaced the while(n!=0) with while(div!=0) for correction.
// Because, if the divisor and dividend would both be equal or divisible by any multiple of 10, it would print zero.
// So, the control should not be with remainder (being zero, code wouldn't go further)
// I gave the control to divisor so that it prints everything.

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int num = 0;
      int temp = n;
      while(temp != 0){
          temp = temp/10;
          num++;
      }
      int div = (int)Math.pow(10, num-1);
      while(div!=0){
        int quo = n/div;
          System.out.println(quo);
          
          n = n%div;
          div = div/10;
          
      }
     }
    }
