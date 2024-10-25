public class Main {
    public static void main(String[] args) {
        System.out.println();

        Fan f1 = new Fan("Leo"); // create an observer fan
        Fan f2 = new Fan("Brad"); // create another observer fan
        Fan f3 = new Fan("Lee"); // create another observer fan

        Celebrity c1 = new Celebrity(); // create a subject (celebrity)

        // register observers with subjects
        f1.addCelebrity(c1);
        f2.addCelebrity(c1);
        f3.addCelebrity(c1);

        // change state of the subjects
        c1.setState("Celebrity posted a new photo"); // notify all observers
        System.out.println();
    }
}
