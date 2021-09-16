import java.beans.PropertyChangeEvent;
import java.util.EventListener;

public class Listener implements EventListener {
    public void changeMyValue(Event e) {
        System.out.println("live result : "+e.getMyValue());
        System.out.println("live result : "+e.getMyValue());
    }
}
