import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int k = scn.nextInt();
       
       // declaration
       int temp = n;
       int nod = 0;
       while(temp>0){
           temp = temp/10;
           nod++;
           
       }
       // sp case1: if no. of rotations are more than no. of digits.
       
       k = k%nod;
       
       // sp case2: if no. of rotations are negative.
       
       
       if(k<0){
           k = k + nod;
       }
       
       // driver
       
       int div = 1;
       int mult = 1;
       for(int i=1; i<=nod; i++){
           if(i<=k){
               div = div*10;
           }
           else{
               mult = mult*10;
           }
       }
       
       int q = n/div;
       int r = n%div;
       
       r = r*mult + q;
       System.out.println(r);
       
    }
   }
