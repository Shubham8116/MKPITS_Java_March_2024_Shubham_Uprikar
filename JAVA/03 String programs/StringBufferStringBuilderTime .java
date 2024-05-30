//Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.
package test;

public class StringBufferStringBuilderTime {
        public static void main(String[] args){
            long startTime = System.currentTimeMillis();//taking start time
            StringBuffer sb = new StringBuffer("Shubham");//creating StringBuffer
            for (int i=0; i<1000000; i++){
                sb.append(" is a good person");
            }
            System.out.println("Time taken by StringBuffer: "+ (System.currentTimeMillis() - startTime) + "ms");

            startTime = System.currentTimeMillis();//taking start time
            StringBuilder sb2 = new StringBuilder("Shubham");//creating StringBuilder
            for (int i=0; i<1000000; i++){
                sb2.append(" is a good person");
            }
            System.out.println("Time taken by StringBuilder: "+ (System.currentTimeMillis() - startTime) + "ms");
        }
    }
    //output of the program
//Time taken by StringBuffer: 146ms
//Time taken by StringBuilder: 98ms .

