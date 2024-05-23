//Event class to store Events
package EventSchedulingSystem.data;
import java.time.LocalDate;
import java.util.*;

public class Events {
    int eventID;
    String eventName;
    String location;
    LocalDate date;

    public Events(int eventID, String eventName, String location, LocalDate date) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Events{" +
                "eventID=" + eventID +
                ", eventName='" + eventName + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                '}';
    }
}
