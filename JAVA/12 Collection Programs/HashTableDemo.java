import java.util.Hashtable;

//program to demonstrate HashTable class
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable();
        hashtable.put(1,"shubham");
        hashtable.put(10,"rahul");
        hashtable.put(14,"pooja");
        hashtable.put(8,"komal");
        hashtable.put(4,"kharanshu");
        hashtable.put(0,"sachin");
        hashtable.put(20,"neha");
      //  hashtable.put(null,"neha");// will throw NullPointer exception in runtime
        //hashtable.put(30,null);// will throw NullPointer exception in runtime
       // hashtable.put(null,"sam");
        System.out.println(hashtable);
        System.out.println(hashtable.get(8)); // will print komal
        System.out.println(hashtable.containsValue("neha")); // will print true


    }
}
