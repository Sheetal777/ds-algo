// This code has a problem.4
// It does  not print ZEROES in the number as input.

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
      while(n!=0){
        int quo = n/div;
          System.out.println(quo);
          
          n = n%div;
          div = div/10;
          
      }
     }
    }
