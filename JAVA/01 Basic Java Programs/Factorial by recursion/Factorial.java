// factorial using recursion.
//The time complexity of the factorial function is O(n) because the function recursively calls itself n times, where n is the input value.
//The space complexity is also O(n) because each recursive call adds a new frame to the call stack, which can potentially grow to a depth of n.

package methods;

public class Factorial {

    public int factorial(int value){
        if (value == 0)
            return 1;
        else
            return(value * factorial(value-1));
    }
}
