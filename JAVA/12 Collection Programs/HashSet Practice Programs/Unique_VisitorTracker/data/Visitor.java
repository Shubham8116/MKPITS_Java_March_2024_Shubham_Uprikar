package Unique_VisitorTracker.data;

public class Visitor {
    int ID;
    String IP;

    public Visitor(String IP,int ID)
    {
        this.ID=ID;
        this.IP = IP;

    }

    public int getID()
    {
        return ID;
    }

    public void setID(int id) {
        ID = id;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "Id='" + ID + '\'' +
                ", IP='" + IP + '\'' +
                '}';
    }
}
