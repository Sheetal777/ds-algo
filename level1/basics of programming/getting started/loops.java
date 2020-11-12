// 1. In for loops, initiation, verification and increment are all done in the same statement. The order in which these operations takes places are: 1. Initiation -> 2. Evaluation -> 3. Execution -> 4. Increment ->234..
int i = 1;
            do{
                System.out.println(i);
                i++;
            }while(i <= 10);

/* 2. Post Increment and Pre Increment
    
        Frequently, you would be encountering statements such as i++, i--, ++i or --i.
        The former two statements are known as post increments/decrements while the latter two are known as pre increments/decrements.
    
        i++ and ++i is equivalent to i = i + 1.
        i-- and --i is equivalent to i = i - 1.
        i++ increments the value of 'i' by 1 but still uses the original value.
        ++i first increments the value of 'i' and then uses the value of the variable.
*/
//For example
        int i = 10;
        y = i++; // (Post increment)
        /* In this case, the initial value of 'i' is 10. The variable y is then assigned the value of 'i' i.e. 10 and the increases the value of 10. The final values of 'i' and 'y' would be 11 and 10 respectively. */
 
        int i = 10;
        y = ++i; // (Pre Increment)
        /* The initial value of 'i' is 10.  The value of 'i' is first incremented and then assigned to the variable y. The final values of 'i' and 'y' would be 11 and 11 respectively. */
