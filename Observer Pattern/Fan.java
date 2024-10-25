import java.util.ArrayList;
import java.util.List;

public class Fan { // ConcreteObserver
    private String name;
    private List<Celebrity> celebrities = new ArrayList<Celebrity>();

    public Fan(){}
    
    public Fan(String name) {
        this.name = name;
    }

    void update(Celebrity c) {
        System.out.println(name + ", notification for you! " + c.getState());
    }

    void addCelebrity(Celebrity c) {
        celebrities.add(c);
        c.attach(this); // add this observer to the subject
    }

    void removeCelebrity(Celebrity c) {
        celebrities.remove(c);
        c.remove(this); // detach this observer from the subject
    }
}
