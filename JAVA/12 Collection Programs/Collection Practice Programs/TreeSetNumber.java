import java.util.TreeSet;

// Write a Java program to find numbers less than 7 in a tree set.
public class TreeSetNumber {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        for (int i = 0; i < 100; i++) {
            i=i+1;
            treeSet.add(i);

        }
        System.out.println("Elements in the TreeSet are : ");
        System.out.println(treeSet);
        //printing elements in the TreeSet which are less than 7
        System.out.println("The elements less than 7 are :  ");
        for (Object o:treeSet)
        {
            if (Integer.parseInt(o.toString())<7)
                System.out.println("The element is :  "+o);
        }

    }
}
