
// Contact class to store contact info
package Contact_List_Application.data;

public class Contact {
    int contactID;
    String name;
    long phoneNumber;
    String email;

    public Contact(int contactID, String name, long phoneNumber, String email) {
        this.contactID = contactID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactID=" + contactID +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
