// Contact class to store the contacts.
package data;

import java.util.Scanner;

public class Contact {
    private String name;
    private long mobno;
    private String email;

    public Contact(String name,long mobno,String email)
    {
        this.name=name;
        this.mobno=mobno;
        this.email=email;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setMobno(long mobno)
    {
        this.mobno=mobno;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }

    public long getMobno()
    {
        return mobno;
    }
    public void displayContact()
    {

        if(mobno!=0)
        {

            System.out.println(" Name: "+name);
            System.out.println(" Mobile No. "+mobno);
            System.out.println(" Email "+email);
            System.out.println("---------------------------------");
        }
    }
    public void updatecontact()
    {
        System.out.println(" Press 1. Name 2. Mobile No. 3. Email");

        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        if(choice==1)
        {
            System.out.println("Enter updated name");
            String change=scanner.next();
            this.name=change;
        }
        if(choice==2)
        {
            System.out.println("Enter updated mobile no.");
            long change=scanner.nextLong();
            this.mobno=change;
        }
        if(choice==3)
        {
            System.out.println("Enter updated email");
            String change=scanner.next();
            this.email=change;
        }
    }
    public void removeContact()
    {
        this.mobno=0;
    }
}
