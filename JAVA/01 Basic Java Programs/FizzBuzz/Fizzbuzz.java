//Write a Java program that prints the numbers from 1 to 100. But for multiples of three, print "Fizz" instead of the number, and for the multiples of five, print "Buzz".
//For numbers that are multiples of both three and five, print "FizzBuzz".
//The time complexity of this Fizzbuzz program is O(n) because it has a single loop that iterates from 1 to 100, where n is the number of iterations.
//The space complexity is O(1) because the amount of memory used by the program does not increase with the input size.

package methods;

public class Fizzbuzz {

        public void showFizzbuzz(){
            int i=0;
            for (i=1;i<100;i++){
                if(i%3==0 || i%5==0){
                    if (i%3==0 && i%5==0){
                        System.out.println("fizzbuzz");
                    }
                    else if(i%3==0){
                        System.out.println("fizz");
                    } else if(i%5==0) {
                        System.out.println("buzz");
                    }
                }
                else {
                    System.out.println(i);
                }
            }
        }

    }
