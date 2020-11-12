// 1. There is no operator for exponentiation. 2 ^ 3 is not 8. This is XOR operator.
// 2. To do exponentiation use Math.pow function. 

   int a = 10; 
   int b = 20;
   a = a + b;
   b = a - b;
   a = a - b;
   
   System.out.println(a + " " + b);

/*It is 20 10
  Operation1: a = a + b; //a is 30 now
  Operation2: b = a - b; //b is 10 now
  Operation3: a = a - b; //30 - 10 takes place */
// swapping of values takes place.
