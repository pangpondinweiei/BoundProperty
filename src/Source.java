import java.util.ArrayList;

public class Source {
    private String source;
    private ArrayList<Listener> listeners;
    public Source() {
        listeners = new ArrayList<>();
    }
    public void setSource(String val) {
        source = val;
        fireMyEvent(new Event(this, source));
    }
    public String getSource() {
        return source;
    }
    public void addMyListener(Listener l) {
        listeners.add(l);
    }
    public void removeListener(Listener l) {
        listeners.remove(l);
    }
    public void fireMyEvent(Event e) {
        for(int i = 0; i < listeners.size(); i++) {
            Listener l = listeners.get(i);
            l.changeMyValue(e);
        }
    }
}
