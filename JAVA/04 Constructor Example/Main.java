// program to demonstrate constructor in java 
public class Main {
    public static void main(String[] args) {
       //creating default constructor        
        Display display =new Display();
        //creating parametrized constructor
        Display dispay =new Display("sony","taarak mehta");
        System.out.println(Display.channel);
        System.out.println(Display.serial);

    }
}