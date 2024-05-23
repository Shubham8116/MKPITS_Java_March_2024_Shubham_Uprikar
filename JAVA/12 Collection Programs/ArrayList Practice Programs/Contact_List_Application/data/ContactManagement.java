// ContactManagement class to perform opeartions on Contact class .
package Contact_List_Application.data;
import java.util.ArrayList;
import java.util.*;

public class ContactManagement {
    int count=0;
    Contact contact;
    List<Contact> list=new ArrayList<Contact>();
    Iterator itr;
    Scanner  scanner=new Scanner(System.in);
    public void addContact(int id,String name,long number,String email)
    {
        contact=new Contact(id,name,number,email);
        list.add(contact);
        System.out.println("Contact added successfully !");
    }
    public void removeContact(int id)
    {
        count=0;
        itr=list.iterator();
        while(itr.hasNext())
        {
            contact=(Contact) itr.next();
            if(contact.getContactID()==id)
            {
                list.remove(contact);
                System.out.println("contact removed successfully !");
                count++;
                return;
            }
        }
        if(count==0)
            System.out.println("Sorry ! no contacts found with the given Id");
    }
    public void searchByName(String name)
    {
        count=0;
        itr=list.iterator();
        while(itr.hasNext())
        {
            contact=(Contact) itr.next();
            if(contact.getName().equalsIgnoreCase(name))
            {

                System.out.println("contact info as follows : ");
                System.out.println(contact);
                count++;
                return;
            }
        }
        if(count==0)
            System.out.println("Sorry ! no contacts found with the given name");

    }
    public void updateByName(String name)
    {
        count=0;
        int newNumber;
        String newEmail;
        itr=list.iterator();
        while(itr.hasNext())
        {
            contact=(Contact) itr.next();
            if(contact.getName().equalsIgnoreCase(name))
            {


                System.out.println("Enter new number");
                newNumber=scanner.nextInt();
                System.out.println("Enter new email");
                newEmail=scanner.next();
                contact.setPhoneNumber(newNumber);
                contact.setEmail(newEmail);
                System.out.println("Contact updated successfully ! ");
                count++;
                return;
            }
        }
        if(count==0)
            System.out.println("Sorry ! no contacts found with the given name");
    }
}
