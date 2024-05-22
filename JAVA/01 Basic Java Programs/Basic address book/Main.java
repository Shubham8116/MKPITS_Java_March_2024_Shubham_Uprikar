//Basic Address Book: Develop an address book program that allows users to store and manage contact information, including names, phone numbers, and email addresses.
import data.Contact;

import java.util.Scanner;

public class Main {
    static int count=0;
    static int displaycount=0;
    public static void main(String[] args) {

        System.out.println("Welcome to your address book");
        Scanner scanner=new Scanner(System.in);
        Contact contact[]=new Contact[11];
        int choice=0;
        while(choice!=5)
        {
            System.out.println("------------------------------------------");
            System.out.println("press 1. Add contact 2. Update contact 3. Remove contact 4. Display contacts 5. Exit");
            choice= scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter name");
                    String name=scanner.next();
                    System.out.println("Enter mobile no.");
                    long mobno= scanner.nextLong();
                    System.out.println("Enter email");
                    String email= scanner.next();
                    contact[count+1]=new Contact(name,mobno,email);
                    System.out.println("Contact added successfully" +
                            "" +
                            "");
                    count++;
                    displaycount++;
                    break;


                case 2:
                    System.out.println("update contact by mobile no. - enter mobile no.");
                    long change=scanner.nextLong();
                    for(int i=1;i<=count;i++)
                    {
                        if(contact[i].getMobno()==change)
                        {
                            contact[i].updatecontact();
                        }
                        else
                        {
                            System.out.println("Enter valid mobile no.");
                        }
                    }
                    break;


                case 3:
                    System.out.println("Remove contact by mobile no.- Enter mobile no.");
                    long remove= scanner.nextLong();
                    for(int i=1;i<=displaycount;i++)
                    {
                        if(contact[i].getMobno()==remove)
                        {
                            contact[i].removeContact();
                            System.out.println("The contact is removed");
                            count--;
                        }
                        else {
                            System.out.println("Enter valid mobile no.");
                        }
                    }
                    break;


                case 4:
                    if(count==0)
                    {
                        System.out.println("No contacts are stored");
                    }
                    else {
                        System.out.println("The address book is:");
                        for (int i = 1; i <=displaycount; i++)
                        {
                            contact[i].displayContact();
                        }
                        }
                    break;

                case 5: System.exit(0);
                        break;


                default:
                    System.out.println("Enter valid choice");
            }

        }
    }
}
