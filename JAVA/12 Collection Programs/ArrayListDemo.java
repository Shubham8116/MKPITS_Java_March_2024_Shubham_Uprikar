//implementing Arraylist class

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        System.out.println(arrayList.isEmpty());//checking arraylist is empty or not .
        System.out.println(arrayList.size());//checking the size of arraylist
        System.out.println(" ");
        arrayList.add(50);//will treat as a object of Object
        arrayList.add(100);//will treat as a object of Object
        arrayList.add(40);//will treat as a object of Object
        arrayList.add(60);//will treat as a object of Object
        System.out.println(arrayList);
        arrayList.add(2,10);
        System.out.println(arrayList);
        System.out.println(" ");
        arrayList.add("shubham");
        arrayList.add("sneha");
        System.out.println(arrayList);
        System.out.println(arrayList.get(5));//will return object class's object
        System.out.println(arrayList.get(5).toString().length());//now object is converted to string and now we can access methods of String class .
        //System.out.println(arrayList.get(2)+arrayList.get(3));//this will give error .
        arrayList.add(5,"pooja");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        //arrayList.clear();// will clear all elements of arraylist .
        System.out.println(arrayList);
        System.out.println(arrayList.subList(0,5));//will print elements from 0 to 4 index.
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList);
        System.out.println(arrayList.contains("shubham"));//will check arraylist contains given element(true) or not(false).
        for(Object object:arrayList )
        {
            System.out.println(object);
        }
       Integer a=new Integer(arrayList.get(2).toString()); //will return Integer type object.
        System.out.println(a.intValue()); // will return int value.

        System.out.println(" ");
        Object object[]=arrayList.toArray();// will convert arraylist into array .
        for(Object o:object)
        {
            System.out.println(o);
        }


        // declaring generic ArrayList of type Student class.
        //ArrayList <Student> =new ArrayList<Student>();

        // declaring generic ArrayList of type Integer.
        ArrayList <Integer> arrayList1=new ArrayList<Integer>();
        arrayList1.add(50);
        arrayList1.add(90);
        arrayList1.add(60);
        arrayList1.add(10);
        System.out.println(arrayList1);
        Collections.sort(arrayList1);
        System.out.println(arrayList1);
        System.out.println("Printing elements through Iterator");
        Iterator iterator=arrayList1.iterator();// implementing Iterator interface
        while (iterator.hasNext()) // iterating through Iterator.
        {
            System.out.println(iterator.next());

        }

          ArrayList  <Integer>arrayList2=new ArrayList<Integer>();
        arrayList2.add(67);
        arrayList2.add(9);
        arrayList2.add(34);
        arrayList2.add(16);
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);



    }
}
