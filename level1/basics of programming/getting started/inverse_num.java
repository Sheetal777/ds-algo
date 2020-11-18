// Indexes and numbers are to be swapped to get inverse of a number.
// For example, 15342 will have an inverse 42315

import java.util.*;

public class Main{

public static void main(String[] args) {
    
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  
  int inv = 0;
  int ori = 1;
  while(n!=0){
      int od = n%10;
      int id = ori;
      int ip = od;
      
      // changes to inverse using ip and id.
      inv = inv + id * (int)Math.pow(10, ip-1);
      n = n/10;
      ori++;
  } 
  System.out.println(inv);
}
}
