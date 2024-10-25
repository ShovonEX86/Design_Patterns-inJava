import java.util.ArrayList;
import java.util.List;

public class Celebrity { // concreteSubject
    private List<Fan> fans = new ArrayList<Fan>();
    private String state; // state of interest

    void attach(Fan f) {
        fans.add(f); // attach a new observer
    }

    void remove(Fan f) {
        fans.remove(f); // remove an observer (fan)
    }

    // notify all observers
    void notifyFans() {
        for (Fan f : fans)
            f.update(this);
    }

    void setState(String s) {
        state = s;
        notifyFans();
    }

    String getState() {
        return state;
    }
}
