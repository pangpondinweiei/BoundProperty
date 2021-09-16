import java.util.*;

public class Event extends EventObject {
    private String myValue;
    public Event(Object source, String val) {
        super(source);
        myValue = val;
    }
    public String getMyValue() {
        return myValue;
    }

}
