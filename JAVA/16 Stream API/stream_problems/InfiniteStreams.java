//Infinite Streams:
//Create a stream of random numbers and limit it to generate 10 random numbers.
package stream_problems;

import java.util.Random;
import java.util.stream.IntStream;

public class InfiniteStreams {
    public static void main(String[] args) {

        //creating object of Random Inbuilt class
        Random random=new Random();

        //generating Stream using random object
        IntStream randStream=random.ints(10);
        randStream.forEach(n-> System.out.print(n+" "));



    }
}
